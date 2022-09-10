// [Concatenation of Array]
// (https://leetcode.com/problems/concatenation-of-array/)
package Array;

public class Concatenation {
    
    public static void main(String[] args) {
        
        int[] nums = {1,2,1};

       
        int size = nums.length *2 ;
        int[] arr = new int[size];


        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        int j=0;
        for (int i = nums.length; i < arr.length; i++) {
            
            arr[i] =nums[j];
            j++;
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}
