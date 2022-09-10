package basic;

import java.util.Scanner;

public class SimpleInt {
            public static void main(String[] args) {
                

                Scanner sc = new Scanner (System.in);
                float principle;

                System.out.println("please enter principle");
                principle = sc.nextFloat();

                float time ;

                System.out.println("Enter the time ");

                time = sc.nextFloat();
                float rate;
                System.out.println("Enter the rate");

                rate =sc.nextFloat();

                float ans;
                ans = ( principle * time * rate) / 100;


                System.out.println("Your simple interest is " + ans);
            }
}
