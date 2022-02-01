package HashMap;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HighestFrequencyCharacter {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!hm.containsKey(ch)){
                hm.put(ch, 1);
            } else {
                int of = hm.get(ch);
                int nf = of + 1;
                hm.put(ch, nf);
            }
        }

        System.out.println(hm);

        Character mfch = str.charAt(0);
        Set<Character> chars = hm.keySet();
        for(char ch : chars){
            if(hm.get(ch) > hm.get(mfch)){
                mfch = ch;
            }
        }


        System.out.println(mfch);


    }
}
