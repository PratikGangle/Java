package recursion;

import java.util.*;

public class Maze {
    public static void main(String[] args) {

        // int ans = count(3, 3);
        // System.out.print(ans);

        // path("", 3, 3);

        // List<List<String>> list = new ArrayList<>();
       
        // pathReturn(3, 3, new ArrayList<>(), list);

        // System.out.println(list);
        // pathDigonal("", 3, 3);

        boolean [][] maze = {   
              {true, true,true}, 
              {true, false,true},
              {true, true,true}                        
            };

            pathRestrictions("", 3, 3, maze);

            

    }

    // retrun the number of count/ way to reach start point to end point
    public static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }

        int left = count(r - 1, c);
        int right = count(r, c - 1);

        return left + right;
    }

    // return the all path staring to end point
    public static void path(String path, int r, int c) {

        if (r == 1 && c == 1) {
            System.out.println(path);
            return;
        }

        if (r > 1) {
            path("D" + path, r - 1, c);
        }
        if (c > 1) {
            path("R" + path, r, c - 1);
        }

    }

    // return path in list
    public static void pathReturn(String path, int r, int c, List<String> list) {

        if (r == 1 && c == 1) {
            list.add(path);
            return;
        }

        if (r > 1) {
            pathReturn("D" + path, r - 1, c, list);
        }
        if (c > 1) {
            pathReturn("R" + path, r, c - 1, list);
        }

    }

    public static void pathReturn(int r, int c, List<String> path, List<List<String>> list) {

        if (r == 1 && c == 1) {
            list.add(new ArrayList<>(path));
            return;
        }

        if (r > 1) {
            path.add("R");
            pathReturn(r - 1, c, path, list);
            path.remove(path.size() - 1);
        }
        if (c > 1) {
            path.add("D");
            pathReturn(r, c - 1, path, list);
            path.remove(path.size() - 1);
        }

    }

    public static void pathRestrictions(String path, int r, int c , boolean[][] maze) {

        if (r == 1 && c == 1) {
            System.out.println(path);
            return;
        }

        if(!maze[r-1][c-1]){
            return;
        }

        if (r > 1) {
            pathRestrictions("D" + path, r - 1, c ,maze);
        }
        if (c > 1) {
            pathRestrictions("R" + path, r, c - 1 , maze);
        }

    }

    public static void pathDigonal(String path, int r, int c) {

        if (r == 1 && c == 1) {
            System.out.println(path);
            return;
        }

        if (r > 1 && c > 1) {
            pathDigonal("D" + path, r - 1, c - 1);
        }
        if (r > 1) {
            pathDigonal("V" + path, r - 1, c);
        }
        if (c > 1) {
            pathDigonal("H" + path, r, c - 1);
        }

    }

}