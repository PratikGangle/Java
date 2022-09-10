package Array;

public class AddArray {


    public static void main(String[] args) {
        

        int arr[] = {1,2,0,0};

        int k =34;

        int ans=0;

        int final_ans=0;


        for (int i = 0; i < arr.length; i++) {
           
            ans = ans*10 + arr[i];
           
        }
        System.out.println(ans);
        final_ans = ans + k;
        System.out.println(final_ans);

    }
}
