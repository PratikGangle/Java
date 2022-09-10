package basic;

public class reverseString {
    public static void main(String[] args) {
        
            
        String name = "abc";

        int size = name.length();

        boolean k =true;

        for(int i=1 ; i<size/2; i++){
            int j;
            j=size;
            if(name.charAt(i)== name.charAt(j-i) ){
               k = true;
            }

            else{
                k = false;
                break;
            }


            


        }
        if( k == true){
            System.out.println("This string is palindrome");

        }
        else{
            System.out.println("Thsi string is not  Palindrome");
        }


    }
}
