package basic;

import java.util.Scanner;

public class EvenOdd {



    public static void main(String[] args) {


        Scanner sc = new Scanner (System.in);

        
        int num =sc.nextInt();


        if(num%2 == 0){
            System.out.println("This is even number");

        }
        else{
            System.out.println("This is odd number");
        }
    }
}
