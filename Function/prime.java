package functions;

import java.util.Scanner;


public class prime {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num;

        num = in.nextInt();
        
        boolean ans = Prime_Number(num);
        System.out.println(ans);



    }

    public static boolean Prime_Number (int num)
    {
        for (int i = 2; i < num; i++) {
            if(num%i==0){
                return false;
            }
        }

        return true;
        


    }
    
}
