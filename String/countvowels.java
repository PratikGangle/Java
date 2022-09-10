package Strings;

public class countvowels {

    public static void main(String[] args) {

        String a = "abdijfdjerjo";

        checkvowels(a);

    }

    public static  void  checkvowels (String  a)
    {
        int i=0;
        int count=0;
        while(i<a.length()){  
                
       if(a.charAt(i)== 'a'||  a.charAt(i)== 'e'|| a.charAt(i)== 'i'|| a.charAt(i)== 'o'|| a.charAt(i)== 'u') {
        count++;
       }
       i++; 

       
    }
    System.out.println(count);
        
    }

}
