package conditionals_loops;

import java.util.Scanner;

public class perfactNumber {
        

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num;
        System.out.println("Enter the number");

        num = in.nextInt();
        
        int sum= 0;

        for (int i = 1; i <num ; i++) {

            if(num%i==0){
                sum = sum + i;
            }

            
        }

            if(num==sum)
            {
                System.out.println("This is perfect number");

            }
            else{
                System.out.println("This is not a prefact number");
            }
    }
}
