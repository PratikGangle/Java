package conditionals_loops;

import java.util.Scanner;

public class sumOfN {
        public static void main(String[] args) {
            

            int num;

            Scanner in =  new Scanner (System.in );

            num= in.nextInt();
            int sum=0;


            for (int i = 1; i <= num; i++) {

                sum = sum +i ;


            }
            System.out.println("Ths of " + num + "  is  " + sum);
        }
}
