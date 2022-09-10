package Array;
public class solution{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        // 100893

        int X = 3;
        int N= 4;

        int ans =search(arr, N, X);
        System.out.println(ans);
    }
        
    static int search(int arr[], int N, int X)
    {
        int start=0;
        int end = N-1;
        
      while(start<end)
      {
      int mid = start + (end - start)/2;


      System.out.println(arr[mid]);
        if(arr[mid]==X){
            
              return mid;
        }
        
        if(arr[mid]>X){
            
            end=mid-1;
        }
        
        else{
            start =mid +1;
            
        }
          
        }
        
        return -1;
    }
    
}