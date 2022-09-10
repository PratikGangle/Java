// [Kids With the Greatest Number of Candies](https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/)

package Array;

import java.util.*;

public class candies {
    public static void main(String[] args) {
        int[] candies= {2,3,5,1,3} ;

    int extracandies = 3;

    int size = candies.length;
    List<Boolean> list=new ArrayList<Boolean>();
    


 for (int i = 0; i < candies.length; i++) {
    if(candies[i]+extracandies >=size){
        list.add(true);
    }
    else{
        list.add(false);
    }
}


    // int size = candies.length;

    // boolean[] arr_ans = new boolean[size];


    // for (int i = 0; i < candies.length; i++) {
    //     if(candies[i]+extracandies >=size){
    //         arr_ans[i]=true;
    //     }
    //     else{
    //         arr_ans[i]=false;
    //     }
    // }


    // for (int i = 0; i < arr_ans.length; i++) {
    //     System.out.print(arr_ans[i] + " ");
    // }
    }

    

    
    
}
