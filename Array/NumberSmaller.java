// How Many Numbers Are Smaller Than the Current Number


// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
package Array;

public class NumberSmaller {


    public static void main(String[] args) {
        int arr[] ={8,1,2,2,3};
    
          int size = arr.length;

         int arr1[] = new int[size];


         int count =0;
         for (int i = 0; i < arr.length; i++) {
          
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] < arr[i])
                {
                    count++;
                }
            }

            arr1[i] = count;
            count=0;

         }


         for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
         }
    }
    
}
