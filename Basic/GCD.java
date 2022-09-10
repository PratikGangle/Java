package basic;


public class GCD
 {
    

    public static void main(String[] args) {
        
        int number1 =12;
        int number2 = 24;

        int ans =1; 

        for (int i = 1; i <= number1; i++) {

            if( (number1 % i == 0 ) && ( number2 % i == 0))
            ans = i;
        }

        System.out.println(ans);
    }
    
        
}
