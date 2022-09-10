package Array;

public class EvenOdddigit {
    
    public static void main(String[] args) {
        
        int arr[] ={12,345,2,6,7896};


        int ans=0;

        int temp;


        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            int digit =0;

            while(temp>0)
            {
                 
                digit++;
                temp =temp/10;

            
            }
            if(digit%2==0)
            {
                
                ans++;
            }
        }

        System.out.println(ans);
    }
}
