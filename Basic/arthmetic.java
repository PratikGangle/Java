package basic;

import java.util.Scanner;

public class arthmetic {


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        
        int num1;
        num1 = sc.nextInt();
        int num2;

        num2 = sc.nextInt();


        System.out.print("addition of two number ");

        System.out.println(num1 + num2);

        System.out.print("subtract of two number "   );
        System.out.println(num1 - num2);

        System.out.print("multiple of two number " );
        System.out.println(num1 * num2);

        System.out.print("division operater "  );
        System.out.println(num1 / num2);

        System.out.print("module opertater " );
        System.out.println(num1 % num2);

     


    }
}
