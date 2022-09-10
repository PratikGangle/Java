package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        
        int arr[]  = {5,4,3,2,1};
        int[] arr1 = {9,14,3,2,43,11,58,22};  

        SelectionSorts(arr1);

        for (int j : arr1) {
            System.out.println(j);
        }
    }

    public static void SelectionSorts(int arr[]){

        for (int i = 0; i < arr.length-1; i++) {
            int index =i;
            for (int j = i+1; j < arr.length; j++) {

               
                
                if(arr[j] < arr[index]) {

                    index = j;                    
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index]= temp;
    }
}
}
