package Array;

public class filppingImage {
    public static void main(String[] args) {
       int [] []image = {{1,1,0} ,{1,0,1} , {0,0,0}};


       for (int i = 0; i < image.length; i++) {
        for (int j = 0; j < image[i].length; j++) {
                System.out.print(image[i][j]);
        }
        System.out.println();
    }


      
       int size = image.length -1;
        
       // create new matrix
       
       int ans[][] = new int [image.length][image.length];
       
       
       // reverse each row

      for (int i = 0; i <=size; i++) {

        
          int k = 0;
           for (int j = size; j >= 0; j--) {   

          
            
                  
               ans[i][k] = image[i][j]; 
               k++;                               
           }
      }


      System.out.println("ans is ");
      for (int i = 0; i < ans.length; i++) {
        for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j]);
        }
        System.out.println();
    }

      


       //  invert the image
    //       for (int i = 0; i <=size; i++) {
          
    //          for (int j = 0; j <= size; j++) {               
               
    //           if( ans[i][j] == 0)   {
    //               ans[i][j]=1;
    //           }
    //              else{
    //                  ans[i][j]=0;
    //              }
                 
    //        }
    //   }
       
       
            

    }
}
