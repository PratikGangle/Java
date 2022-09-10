package functions;

public class MaxMin {


    public static void main(String[] args) {
        
        int num1=111;
        int num2=22;
        int num3=300;

        Max(num1 , num2 ,num3);
        Min(num1 , num2 ,num3);

        


        
           
    }

    static void Max(int num1 , int num2, int num3){

        if(num1>num2)
        {
            if(num1>num3)
            {
                System.out.println(num1);
            }
            else{
                System.out.println(num3);
            }
        }

        else 
        {
            if(num2>num3)
            System.out.println(num2);

            else{
                System.out.println(num3);
            }
        }
    
    }

    static void Min(int num1 , int num2, int num3){

        if(num1<num2)
        {
            if(num1<num3)
            {
                System.out.println(num1);
            }
            else{
                System.out.println(num3);
            }
        }

        else 
        {
            if(num2<num3)
            System.out.println(num2);

            else{
                System.out.println(num3);
            }
        }
    
    }

    

    
}
