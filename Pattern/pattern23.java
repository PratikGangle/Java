package pattern;
import java.util.Scanner;


public class pattern23 {
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        // System.out.println("Please enter number of row ");
        // int row;
        // row = sc.nextInt();
        
        for (int i = 1; i <=3; i++) {
            for (int j = 1; j <=9; j++) {

                if(i+j==4 || j-i==2 ||  j-i == 6 || i==2 && j==6){
                    System.out.print("*");
                }  
                else{
                    System.out.print(" ");
                }             
                
            }
            System.out.println();
        }
    }
}
