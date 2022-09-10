package Strings;
import java.lang.*;


public class shortestpath {

    public static void main(String[] args) {

        // String path = "SSSNEEEW";
        String path = "WESSN";

        System.out.println(shortpath(path));
    }

    public static float shortpath(String path) {

        float x = 0;
        float y = 0;

        float ans = 0;

        int start = 0;

        while (start < path.length()) {

            if (path.charAt(start) == 'N') {
                y++;
            } else if (path.charAt(start) == 'S') {
                y--;
            } else if (path.charAt(start) == 'W') {
                x--;
            } else {
                x++;
            }

            start++;
        }

        float y2 = y * y;
        float x2 = x * x;

        ans = (float) Math.sqrt(x2 + y2);

        return ans;

    }
}
