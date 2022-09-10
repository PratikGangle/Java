package Array;

public class highestAttitude {



    public static void main(String[] args) {
        int gain[] = {-5,1,5,0,-7};


        int max=0;
        int current=0;



        for (int i = 0; i < gain.length; i++) {

             current =  current + gain[i];

             max = Math.max(max, current);


            
        }


        System.out.println(max);
    }
}
