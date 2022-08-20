

package pattern;
import java.util.Scanner;

public class pattern18{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter  number of row");
        int row;
        row = sc.nextInt();
        
        // for upper
        for (int i = 1; i <= row; i++) {
                for (int j = 1; j <=row+1-i; j++) {
                
                    System.out.print("*");
                }
                for (int j = 1; j <2*i-1; j++) {
            
                    System.out.print(" ");
                }

                for (int j = 1; j <= row +1 -i; j++) {
                    System.out.print("*");
                }
                System.out.println();
             
        }

        // for lower
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <=i; j++) {
            
                System.out.print("*");
            }
            for (int j = 1; j <=2*(row-i); j++) {
        
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
         
    }

    
    }
}
