    package basic;

import java.util.Scanner;

public class GeaterNumber
    {


        public static void main(String[] args) {
            

           


            Scanner sc = new Scanner(System.in);
            int num1;
            int num2;
            num1 = sc.nextInt();
            num2 =sc.nextInt();


            if(num1>num2)
            {
                System.out.println("Geater number is " +  num1);
            }
            else{
                System.out.println("Geater number is " +  num2);
            }
        }
    }