package pattern;
import java.util.Scanner;


public class pattern6 {
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of row ");
        int row;
        row = sc.nextInt();
        
        for (int i = 1; i <=row; i++) {
            for (int j = 1; j <=row; j++) {
                if(i+ j <=5) {
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
