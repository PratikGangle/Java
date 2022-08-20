package pattern;
import java.util.Scanner;

public class pattern14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter  number of row");
        int row;
        row = sc.nextInt();
        
        for (int i = 1; i <= row; i++) {
                for (int j = 1; j <=2*row;  j++) {
                    if( i==1 || i+j == row*2 || j-i == 0  )
                    System.out.print("*");
                    else{
                        System.out.print(" ");
                    }

                }
                
                System.out.println();
        }
    }
}
