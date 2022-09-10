package Array;

public class matrixdigsum {

    public static void main(String[] args) {
     
        
        int arr[][] = { {1,2,3}, {4,5,6}, {7,8,9}};

        int sum=0;

        int n = arr.length;

        for (int i = 0;  i<n; i++) {

            sum += arr[i][i] + arr[i][n-i-1];
           
        }

        if(n%2==0)
        {
            System.out.println(sum);
        }

        else{
            sum = sum - arr[n/2][n/2];
            System.out.println(sum);
        }



    }
    
}
