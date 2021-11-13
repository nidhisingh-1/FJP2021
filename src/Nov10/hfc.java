package Nov10;

import java.util.Scanner;

//highest frequency character
public class hfc {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        int [] farr = new int[26];

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            int idx = ch - 'a';
            farr[idx]++;
        }

        int maxidx = 0;
        for(int i = 0 ; i < farr.length ; i++){
              if(farr[i] > farr[maxidx]){
                  maxidx = i;
              }
        }

        char maxch = (char) (maxidx + 'a');
        System.out.println(maxch);
    }
}
