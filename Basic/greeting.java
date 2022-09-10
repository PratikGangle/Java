package basic;

import java.util.Scanner;

public class greeting {
        public static void main(String[] args) {
            

        Scanner sc = new Scanner (System.in);

        System.out.println("Please enter your name");
        
        String Name = sc.nextLine();

        System.out.println("hello " +  Name);
        }
}
