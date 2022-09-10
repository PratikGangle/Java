package Sorting;

import javax.swing.event.SwingPropertyChangeSupport;

public class bubbleSort {
    public static void main(String[] args) {

        int arr[] = { 5, 4, 3, 2, 1 };

        BubbleSort(arr);

        for (int i : arr) {
            System.out.println(i);
        }

    }

    public static void BubbleSort(int[] arr)

    {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {

            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false){
                break;
            }
        }

    }

}