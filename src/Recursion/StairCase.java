package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class StairCase {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(getStairPaths(n));

    }

    public static ArrayList<String> getStairPaths(int n) {

        if(n == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        } else if(n < 0){
            return new ArrayList<>();
        }

        ArrayList<String> rres1 = getStairPaths(n-1);
        ArrayList<String> rres2 = getStairPaths(n-2);
        ArrayList<String> rres3 = getStairPaths(n-3);

        ArrayList<String> myres = new ArrayList<>();

        for(String ans : rres1){
            myres.add("1" + ans);
        }

        for(String ans : rres2){
            myres.add("2" + ans);
        }

        for(String ans : rres3){
            myres.add("3" + ans);
        }

        return myres;
    }
}
