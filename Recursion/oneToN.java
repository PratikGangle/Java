package Recursion;

public class oneToN {

    public static void main(String[] args) {

        printNumber(5);

    }

    public static void printNumber(int a) {
        if (a == 0)
            return;

        System.out.println(a);
        printNumber(a - 1);
    }
}
