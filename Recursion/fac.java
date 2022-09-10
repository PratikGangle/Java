package Recursion;

public class fac {

    public static void main(String[] args) {

        int ans = fact(5);

        System.out.println(ans);

    }

    public static int fact(int a) {
        if (a == 1) {

            return 1;
        }

        int ans = a * fact(a - 1);

        return ans;

    }
}
