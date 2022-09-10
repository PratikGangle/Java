package basic;

import java.util.Scanner;

public class RsTodoller {
        public static void main(String[] args) {
            
            Scanner sc = new Scanner (System.in);

            float rupay = sc.nextFloat();


            double doller ;

            doller = ( rupay * 0.013 );


            System.out.println(rupay +   " in the doller is "  +  doller);



        }
}
