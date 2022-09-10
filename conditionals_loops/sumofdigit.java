package conditionals_loops;

import java.util.Scanner;

public class sumofdigit {


    public static void main(String[] args) {
        
        Scanner in =new Scanner(System.in);

        int num;

        num = in.nextInt();
        int temp = num;
        int digit =0;

        while(temp>0)
        {
            int rem = temp % 10;
            digit = digit  + rem;

            temp =temp/10;

        }
        System.out.println("The");
        System.out.println(digit);
    }



}