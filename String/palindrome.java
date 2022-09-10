package Strings;

public class palindrome {
    public static void main(String[] args) {
        
        String a = "madaM";

        System.out.println(checkpalindrome(a)); 
    }

    public static boolean checkpalindrome (String name){

        name = name.toLowerCase();
        
        int start =0;
        int end = name.length()-1;
        while(start<end){
            if(name.charAt(start) != name.charAt(end)){
               
                return false;
                
            }
            start++;
            end--;
           
        }
        return true;
        
    }
}
