// Print name N times using recursion

package Recursion;

public class name {

    public static void main(String[] args) {

        printname(5);

    }

    public static void printname(int n) {
        if (n == 0) {
            return;
        }

        printname(n - 1);
        System.out.println("Pratik");
    }

}
