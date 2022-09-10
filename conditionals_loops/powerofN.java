package conditionals_loops;
import java.util.Scanner;

public class powerofN {
        public static void main(String[] args) {
            
            Scanner in = new Scanner (System.in);

            System.out.println("Enter a number");



            int num ;
            num= in.nextInt();
            System.out.println("Enter The power of number");
            int power = in.nextInt();

            int sum=1;
            for (int i = 1; i <= power; i++) {

                sum = sum * power;
                
            }

            System.out.print("Ans is ");
            System.out.println(sum);
        }
}
