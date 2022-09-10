package Array;

public class wealth {
    
    public static void main(String[] args) {
        
        int accounts[][] =  {{1,2,3} ,{ 3,2,1}}  ;

        int wealth=0;
        int size =accounts.length;
        int arr1[] = new int[size];

        for (int i = 0; i < accounts.length; i++) {
            wealth =0;

            for (int j = 0; j < accounts[i].length; j++) {

                wealth = wealth + accounts[i][j];
                
            }
            arr1[i]=wealth;
        }
                
        int max_wealth =0;

        for (int i = 0; i < arr1.length; i++) {
            if(max_wealth<arr1[i])
            {
                max_wealth = arr1[i];
            }
        }

        System.out.println(max_wealth);

    }
}
