package pattern;

import java.util.Scanner;

public class pattern19 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the number of row");

        int row = in.nextInt();
        
        // for upper
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("");


            for (int j = 1; j <= 2 *(row -i) ; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        // for lower
        for (int i = 1; i <= row-1; i++) {
            for (int j = 1; j <=row-i; j++) {
                System.out.print("*");
            }
            System.out.print("");


            for (int j = 1; j <= 2 *i ; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <=row -i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
