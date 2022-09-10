// https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/


// Cells with Odd Values in a Matrix

package Array;



public class celloddvalue {


    public static void main(String[] args) {
        
        
        int arr[][] = { {0,0,0}, {0,0,0}};

        
        int[][] indices = {{0,1}, {1,1}};

        int k=2;

        
        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < indices[i].length; j++) {
            
                if(k%2==0){
                    row(arr ,indices[i][j] );
                }

                else{
                    col(arr ,indices[i][j] );

                }
                k++;

                
                
            }
        }

        for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j]);
                    
                }
                System.out.println();
        }

    }
        // row increment

        public static void row (int[][] arr , int row){

                    
            for (int i = 0; i < 3; i++) {

               arr[row][i]= arr[row][i]  + 1;
             
                          
            }
        }


        public static void col (int[][] arr , int col){

                    
            for (int i = 0; i < 2; i++) {

               arr[i][col]= arr[i][col]  + 1;
             
                          
            }
        }




        

    
    
}
