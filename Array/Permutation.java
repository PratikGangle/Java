// Build Array from Permutation(https://leetcode.com/problems/build-array-from-permutation//)
package Array;

public class Permutation {


    public static void main(String[] args) {
        
        int[] arr = {0,2,1,5,3,4};



        // creat new array
        int [] arr1 = new int [arr.length];



        // assign value in new array
        for (int i = 0; i < arr.length; i++) {
            
           arr1[i]  = arr[arr[i]];
          
        }


        // printing array
        for (int i = 0; i < arr1.length; i++) {
            
            System.out.println(arr1[i]);

           
         }
      
       
    }
    
}
