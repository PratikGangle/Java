package pattern;
import java.util.Scanner;


public class pattern27 {
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of row ");
        int row;
        row = sc.nextInt();

        int var = 1;
        int sum = 0;

        // find the printing value

        for (int i = 1 ; i <= row; i++) {

            sum = sum +i;
            
        }
        // last printing value  
        int var2 = sum * 2 ;

        var2 =var2-(row-1);
        
       
        // print pattern
        for (int i = 1; i <=row; i++) {

            // for space 
            for (int j = 1; j <i ; j++) {
                System.out.print("   ");
            }


            // for first pyramid
            for (int j = 1; j <=row+1-i; j++) {
                System.out.print(var + "  ");
                var++;
            }

            
            
            // for second pyramid
            int j;
            for ( j = 1; j <= row+1 -i; j++) {

                System.out.print(var2 + " ");
                var2++;

                
                
            }
            j= (j-2 )* 2;
            // formula 
            var2 = var2-1 - j;
            System.out.println();
        }
    }
}
