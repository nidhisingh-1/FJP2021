package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class StairCasewJumps {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> paths = getMazePaths(0, 0, n - 1, m - 1);
        System.out.println(paths);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {


        if (sr > dr || sc > dc) {
            return new ArrayList<>();
        }

        if (sr == dr && sc == dc) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> paths = new ArrayList<>();

        for (int ms = 1; ms <= dc - sc; ms++) {
            ArrayList<String> horizontal = getMazePaths(sr, sc + ms, dr, dc);
            for (String hpaths : horizontal) {
                paths.add("h" + ms + hpaths);
            }
        }

        for (int ms = 1; ms <= dr - sr; ms++) {
            ArrayList<String> vertical = getMazePaths(sr + ms, sc, dr, dc);
            for (String vpaths : vertical) {
                paths.add("v" + ms + vpaths);
            }
        }

        for (int ms = 1; ms <= dc - sc && ms <= dr - sr; ms++) {
            ArrayList<String> diagonal = getMazePaths(sr + ms, sc + ms, dr, dc);
            for (String dpaths : diagonal) {
                paths.add("d" + ms + dpaths);
            }
        }

//

        return paths;
    }
}
