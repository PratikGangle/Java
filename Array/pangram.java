package Array;

public class pangram {
    public static void main(String[] args) {
        
       String input =  "thequickbrownfoxjumpsoverthelazydog";
       
       int[] arr = new int [26];

       

       int var;
       
       for (int i = 0; i < input.length(); i++) {
               
         var = input.charAt(i);

        var = var-97;

        arr[var] = 1;
        
       }

       
       boolean check = true;
       for (int i = 0; i < arr.length; i++) {

        
        if(arr[i] == 0){

          check = false;
        }
       }

       if(check)
       {
        System.out.println("This is a pangram sentence");
       }
       else{
        {
            System.out.println("This is a pangram sentence");
           
       }

    }
    }
}
