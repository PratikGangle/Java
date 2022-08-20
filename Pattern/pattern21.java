package pattern;
import java.util.Scanner;


public class pattern21 {
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of row ");
        int row;
        row = sc.nextInt();
        int var  =1;
        for (int i = 1; i <=row; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(var + " ");
                var++;
            }
            System.out.println();
        }
    }
}
