package conditionals_loops;

import java.util.Scanner;

public class rervseNumber {


    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        int num;

        num = in.nextInt();

        int temp =num;

        int rev =0;
        while(temp > 0)
        {
           int  rem= temp%10;
            rev = rev * 10 +  rem;

            temp = temp/10;
        }

        System.out.println("The reverse number of " + num +  " is " + rev);


    }
}
