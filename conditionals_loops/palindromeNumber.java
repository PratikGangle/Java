
package conditionals_loops;

import java.util.Scanner;

public class palindromeNumber{
        public static void main(String[] args) {
            

            int num;

            Scanner in =  new Scanner (System.in );

            num= in.nextInt();
            
            int rev=0;
            int temp =num;
            
            while(temp > 0)
            {
                int rem = temp%10;
                rev  = rev * 10 + rem;

                temp = temp/10;
            }

            if(num==rev)
            {
                System.out.println("this is palindrome Number");
            }
            else{
                System.out.println("Thsi is not a palindrome number");
            }
        }
}
