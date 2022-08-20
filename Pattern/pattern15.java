package pattern;
import java.util.Scanner;

public class pattern15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter  number of row");
        int row;
        row = sc.nextInt();
        
        for (int i = 1; i <= row; i++) {
                for (int j = 1; j <=2 *row-1; j++) {
                    if( i+j == row+1 || j-i == row-1 )
                    System.out.print("*");
                    else{
                        System.out.print(" ");
                    }

                }
                
                System.out.println();
               
        }

        for (int i = 1; i <row; i++) {
            for (int j = 1; j <= 2 *row-1; j++) {
                if( j-i == 1  || i +j ==2 *row-1)
                System.out.print("*");
                else{
                    System.out.print(" ");
                }

            }
            
            System.out.println();
           
    }
    }
}
