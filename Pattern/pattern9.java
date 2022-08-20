package pattern;
import java.util.Scanner;


public class pattern9 {
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of row ");
        int row;
        row = sc.nextInt();

        
        int star=row;
        for (int i = 1; i <=row; i++) {
           
            for(int j=1;  j<i; j++)
            {
              System.out.print(" ");

            }
          

            for (int j = 1; j <=(star*2)-1; j++) {
                      System.out.print("*");
                
            }
            star--;
            System.out.println();
        }
    }
}
