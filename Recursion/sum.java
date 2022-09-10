package Recursion;

public class sum {

    public static void main(String[] args) {

        int ans = sum(5);

        System.out.println(ans);

    }

    public static int sum(int a) {
        if (a == 1) {

            return 1;
        }

        int ans = a + sum(a - 1);

        return ans;

    }
}
