package Strings;

import java.lang.*;

public class UpperCase {
    
    public static void main(String[] args) {
        
        String str = "Hi t am pratik";

        // using string
        // System.out.println(UpperCases(str));


        // using string builder
               UpperCases2(str);
    }

    // StringBuilder uppercase change


    public static String UpperCases2(String str){

        int i;
        String ans= "";
        int end = str.length()-1;

        for (i = 0; i < str.length(); i++) {

            if(str.charAt(i) == ' '){
                
                ans= ans +  str.charAt(i);
                i++;
                ans = ans + ((str.charAt(i) + "" ).toUpperCase() );
                
            }
            else{

                ans= ans +  str.charAt(i);
            }
            
            
        }
        return ans;
    }

        // string uppercase change


    public static String UpperCases(String str){

        int i;
        String ans= "";
        int end = str.length()-1;

        for (i = 0; i < str.length(); i++) {

            if(str.charAt(i) == ' '){
                
                ans= ans +  str.charAt(i);
                i++;
                ans = ans + ((str.charAt(i) + "" ).toUpperCase() );
                
            }
            else{

                ans= ans +  str.charAt(i);
            }
            
            
        }
        return ans;
    }
}
