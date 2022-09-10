package Strings;

import javax.lang.model.util.ElementScanner14;

public class LargestString {
    

    public static void main(String[] args) {
        
        String a = "aango";
        String b = "apple";

       if(a.compareTo(b) == 0){
        System.out.println("String are equal");

       }
       else if(a.compareTo(b) > 0){
        System.out.println("A  string is greater");
       }
       else{
        System.out.println("B string is greater ");
       }

    }
}
