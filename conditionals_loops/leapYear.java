package conditionals_loops;

import java.util.Scanner;


public class leapYear{

   public static void main(String[] args) {
    
    Scanner in = new Scanner (System.in);


    int year;


    year = in.nextInt();

    if(year%4==0)
    {
        if(year%100== 0)
        {
           if(year%400 == 0){
            System.out.println("Thsi is leap year");
           }
           else{
            System.out.println("This is not leap year");
           }
        }
      else{
        System.out.println("This is leap year");
      }
     
    }

    else{
        System.out.println("This not a leap year");
    }
   }
        







}