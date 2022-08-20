package pattern;
import java.util.Scanner;


public class pattern7 {
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of row ");
        int row;
        row = sc.nextInt();
        
        for (int i = 1; i <=row; i++) {
            for (int j = 1; j <=row+1-i; j++) {
                System.out.print("*");
                
            }
            System.out.println();
        }
    }
}
