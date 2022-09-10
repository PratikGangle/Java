package Array;

public class shuffle {
    public static void main(String[] args) {
        
        int arr[] ={1,2,3,4,4,3,2,1};

        int n=4;


        int arr2[] = new int[n];
        int arr3[] = new int[n];


        for (int i = 0; i < n; i++) {

            arr2[i] = arr[i];
            
        }
        for (int i = 0; i < n; i++) {

            arr3[i] = arr[i+n];
            
        }


        for (int i = 0; i < n; i++) {

            System.out.print(arr2[i]);
            System.out.print(arr3[i]);
            
        }


       




    }
}
