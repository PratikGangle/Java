package conditionals_loops;

import java.util.Scanner;


public class Armstrong {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int num= in.nextInt();
        int temp = num;
        int digit=0;
        int final_number =0;

        while(num>0)
        {
            digit = num%10;
            num = num/10;

            digit = digit * digit * digit ;

            final_number = final_number + digit;





        }


        if(final_number == temp)
        {
            System.out.println("This is a armstrong number");
        }
        else{
            System.out.println("Thsi is not a armstrong number");
        }

    }
}
