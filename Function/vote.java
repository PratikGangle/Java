package functions;

import java.util.Scanner;

public class vote {
    
    public static void main(String[] args) {
        
        Scanner in =new Scanner(System.in);

        System.out.println("Enter your age");
        int age = in.nextInt();


        vote(age);
    }


    static void vote(int age)
    {
        if(age<=18)
        {
            System.out.println("You can vote");

        }
        else{
            System.out.println("You can not vote");
        }
    }
}
