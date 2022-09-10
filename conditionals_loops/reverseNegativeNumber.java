package conditionals_loops;
public class reverseNegativeNumber {


    public static void main(String[] args) {
        
    
       
                int x=123456789;
                int ans=0;
                int digit=0;
                
                      
                       
                while(x!=0)
                {
                    if( (ans >  Integer.MAX_VALUE/10)  || (ans < Integer.MIN_VALUE/10))
                    {
                       System.out.println("out of ");
                    }
                   digit = x%10;
                    ans = ans *10 + digit;
                    x = x/10;
                }

                System.out.println(ans);
               
                
             
                   
              
                
            
        
        
    }

    
}
