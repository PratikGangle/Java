package Recursion;

public class NToOne {

    public static void main(String[] args) {

        printNumber(5);

    }

    public static void printNumber(int a) {
        if (a == 0) {
            return;

        }
        printNumber(a - 1);
        System.out.println(a);
    }
}
