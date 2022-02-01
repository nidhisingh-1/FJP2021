package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class getCommonElementsOne {

    public static void main(String[] args) {

        HashMap<Integer, Integer> fmap = new HashMap<>();

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] one = new int[n];
        for(int i = 0 ; i < one.length ; i++){
            one[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        int [] two = new int[m];
        for(int i = 0 ; i < two.length ;i++){
            two[i] = scn.nextInt();
        }

        for(int i = 0 ; i < one.length ; i++){
            if(!fmap.containsKey(one[i])){
                fmap.put(one[i], 1);
            } else {
                int of = fmap.get(one[i]);
                int nf = of + 1;
                fmap.put(one[i], nf);
            }
        }

        for(int val : two){
            if(fmap.containsKey(val)){
                System.out.println(val);
                fmap.remove(val);
            }
        }
    }
}
