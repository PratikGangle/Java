package functions;

import java.net.SocketTimeoutException;
import java.util.Scanner;

public class sum {
    

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);


        System.out.println("Enter the first number");
        int num1 =in.nextInt();


        System.out.println("Enter the second number");
        int num2 = in.nextInt();



       int ans = sum(num1, num2);

       System.out.println("The sum of given two number is " + ans);



    }

    static int sum(int num1 , int num2)
    {
        int sum = num1 + num2 ;

        return sum;
    }
}
