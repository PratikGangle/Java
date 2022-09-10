package basic;

import java.util.Scanner;



public class _Fibonacci {


    public static void main(String[] args) {
        
  
        Scanner sc = new Scanner (System.in);

    int num1 = 0;
    int num2= 1;

    int num3 =0;

        System.out.println("enter the number");
            int number = sc.nextInt();


for (int i = 0; i < number; i++) {
    System.out.print(num3 );
    System.out.print(" ");
    num3 = num1 + num2;

    num1 = num2;
    num2 = num3;

    
}        
    

    
}
}
