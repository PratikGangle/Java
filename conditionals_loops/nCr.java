package conditionals_loops;

import java.util.Scanner;

// import javax.sound.sampled.SourceDataLine;

public class nCr {
    public static void main(String[] args) {
            
            Scanner in = new Scanner (System.in);
            int number;
            int r;
            System.out.println("Enter the value of n");

            number = in.nextInt();
            System.out.println("Enter the value of r");
            r = in.nextInt();

            int fac_number=1;
            int fac_r=1;

            for (int i = 1; i <= number; i++) {
                fac_number = fac_number * i;
            }

            
            for (int i1 = 1; i1 <= r; i1++) {
                fac_r = fac_r * i1;
            }

            int number_r = number - r;
            int fac_number_r=1;

            for (int j = 1; j <= number_r; j++) {
                fac_number_r = fac_number_r * j;
            }


            int ans;

            ans= fac_number / ( fac_r * ( fac_number_r));

            System.out.println(ans);
        }
}
