package conditionals_loops;

import java.util.Scanner;

public class avarageOfN {
        public static void main(String[] args) {
            
            Scanner sc = new Scanner (System.in);

                System.out.println("Enter the number");
            int number;
            number =sc.nextInt();

            int sum=0;

            System.out.println("Enter your number");
                for (int i = 1; i <= number; i++) {
                        sum = i + sum;

                                                
                }
                int avarage = sum /number;

                System.out.println("The avarage of " + number + " is " + avarage);
            
        }
}
