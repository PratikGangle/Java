package pattern;
import java.util.Scanner;


public class pattern24 {
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of row ");
        int row;
        row = sc.nextInt();
        
        for (int i = 1; i <=row *2; i++) {
            for (int j = 1; j <=2*row; j++) {

                if(j==1 || j==row*2  || j+i ==row*2 +1 || i==j )
                System.out.print("*");
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
