package pattern;
import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter  number of row");
        int row;
        row = sc.nextInt();
        
        for (int i = 0; i < row; i++) {
                for (int j = 0; j < row; j++) {
                    System.out.print("*");

                }
                System.out.println();
        }
    }
}
