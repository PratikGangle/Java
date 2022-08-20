package pattern;
import java.util.Scanner;


public class pattern17 {
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of row ");
        int row;
        row = sc.nextInt();

        // for upper
        for (int i = 1; i <=row; i++) {
            for (int j = 1; j <=row-i; j++) {
                System.out.print( "  ");
               
            }

            for (int j = i; j >0; j--) {
                System.out.print(j + " ");
                
            }
            for (int j = 1; j <i; j++) {
                System.out.print(j+1 + " ");
                
            }
            
            System.out.println();
        }

        // for lower

        for (int i = 1; i <=row-1; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print( "  ");
               
            }

            for (int j = row-i; j>=1; j--) {
                System.out.print(j + " ");
                
            }
            for (int j = row-i; j >=1; j--) {
                System.out.print(j + " ");
                
            }
            
            System.out.println();
        }


    }
}
