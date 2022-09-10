package Recursion;

public class arrayReverse {

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4 };
        arrayReverses(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void arrayReverses(int arr[], int start, int end) {
        if (start > end) {
            return;
        }
        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
        arrayReverses(arr, start + 1, end - 1);

    }
}
