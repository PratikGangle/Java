package pattern;
import java.util.Scanner;

public class pattern16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter  number of row");
        int row;
        row = sc.nextInt();
        
        for (int i = 1; i <= row; i++) {
            int number  =1;
                for (int j = 1; j <=row-i; j++) {
                    System.out.print(" ");

                }
              
               
                for (int j = 1; j <= i; j++) {
                    System.out.print(number + " ");

                    number = (number )* (i-j)/j;
                }
               
                System.out.println("");
                }
    }
}
