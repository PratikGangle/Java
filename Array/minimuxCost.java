package Array;

public class minimuxCost {

    public static void main(String[] args) {
        // int [] arr = {1,2,3};
        int [] arr = {2,2,2,3,3};


        int size = arr.length;

        int odd=0;


        for (int i = 0; i < size; i = i +2) {
            odd = odd + arr[i];

        }

        int even = 0;

        for (int i = 1; i < size; i = i +2) {
            even = even + arr[i];

        }

        // if(odd>even)
        // {
        //     System.out.println(even);
        // }
      

        // else{
        //     System.out.println(odd);
        // }
        System.out.println(even);
        System.out.println(odd);
        


            
        


    }
    
}
