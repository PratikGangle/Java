// [Number of Good Pairs](https://leetcode.com/problems/number-of-good-pairs/)
package Array;

public class goodPair {
    public static void main(String[] args) {
        
        // int[] num = new int[];

        // int[] num = { 1,1,1,1};

        int [] num = { 1,2,3,1,1,3};


        int count =0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {


                if(  num[j] ==num[i]  && i<j) 
                {
                    System.out.println(num[i]+ " " + num[j]);
                    count++;
                   

                }
               
                
            }
        }

        System.out.println(count);
    }
}

