package Recursion;

import java.util.Scanner;

public class printMPjumps {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        printMazePaths(0,0,n-1,m-1,"");

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {

        if(sr == dr && sc == dc){
            System.out.println(psf);
            return;
        } else if (sr > dr || sc > dc){
            return;
        }

        for(int ms = 1 ; ms <= dc - sc ; ms++){
            printMazePaths(sr , sc + ms, dr, dc, psf + "h" + ms);
        }

        for(int ms = 1 ; ms <= dr - sr ; ms++){
            printMazePaths(sr + ms , sc, dr, dc, psf + "v" + ms);
        }

        for(int ms = 1 ; ms <= dr - sr && ms <= dc - sc ; ms++){
            printMazePaths(sr + ms , sc+ms, dr, dc, psf + "d" + ms);
        }

    }
}
