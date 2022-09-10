package Array;

import java.util.*;

public class addInterger {

    public static void main(String[] args) {

        // int num[] = {1,2,0 ,0};
        // int k= 34;

        // int num[]= {2,1,5};
        // int k = 806;

        // int num[] = {9,9,9,9,9,9,9,9,9,9};

        // int k =0;

        int num[] = { 1, 2, 6, 3, 0, 7, 1, 7, 1, 9, 7, 5, 6, 6, 4, 4, 0, 0, 6, 3 };
        int k = 516;

        // create a new list

        List<Integer> list = new ArrayList<Integer>();

        long number = 0;
        int digit = 0;

        // find the array numbers

        for (int i = 0; i < num.length; i++) {
            number = (number * 10) + num[i];
        }

        System.out.println(number);

        // adding the integer k in the number

        // number = number + k;
        // long temp = number;

        // // find the number of digit
        // while (number > 0) {
        //     number /= 10;
        //     digit++;
        // }

        // System.out.println(digit);

        // // create a new array size of digit

        // int[] arr = new int[digit];

        // int rem = 0;
        // int j = 0;

        // // store value in the array

        // while (temp > 0) {
        //     rem = (int)(temp % 10);
        //     temp /= 10;
        //     arr[j++] = rem;

        // }
        // for (int i = 0; i < num.length; i++) {
        //     System.out.println(arr[i]);
        // }
        // // store value in the list

        // for (int i = arr.length - 1; i >= 0; i--) {
        //     list.add(arr[i]);
        // }

        // System.out.println(list);

    }
}
