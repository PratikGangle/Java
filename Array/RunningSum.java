// [Running Sum of 1d Array](https://leetcode.com/problems/running-sum-of-1d-array/)

package Array;

public class RunningSum {

    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4};

        int size = arr.length;

        int[] arr1  = new int[size];

        arr1[0] = arr[0];

        for (int i = 1; i <size; i++) {

            arr1[i] = arr1[(i-1)] + arr[i];
            
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
    
}
