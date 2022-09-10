package functions;

import conditionals_loops.nCr;

public class primeRange {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        Prime_Numbers(num1, num2);
    }

    public static void Prime_Numbers(int num1, int num2) {
        boolean a;

        for (int i = num1; i < num2; i++) {

            a = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    a = false;
                   }
            }
            // System.out.println(i);
            if (a == true)
                System.out.println(i);
        }

    }

}