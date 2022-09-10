package Sorting;

public class CyclingSort {

    public static void main(String[] args) {

        int arr[] = { 5, 4, 3, 2, 1 };

        sort(arr);

        for (int i : arr) {
            System.out.println(i);            
        }

    }

    public static void sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int index = arr[i] -1 ;

            if(arr[index] != arr[i]){
                int temp =arr[index];
                arr[index] = arr[i];
                arr[i] =temp;
            }
        }

    }
}
