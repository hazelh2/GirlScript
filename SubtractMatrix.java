public class SubtractMatrix  
{  
    public static void main(String[] args) {  
        int rows, cols;  
  
        //Initialize matrix a  
          int a[][] = {  
                          {18, 22, 19},  
                          {61, 8, 34},  
                          {24, 1, 0}  
                       };  
  
          //Initialize matrix b  
          int b[][] = {  
                         {14, 5, 11},  
                         {12, 17, 87},  
                         {20, 23, 22}  
                     };  
  
          //Calculates number of rows and columns present in given matrix  
          rows = a.length;  
        cols = a[0].length;  
  
          //Array diff will hold the result  
        int diff[][] = new int[rows][cols];  
  
        //Performs subtraction of matrices a and b. Store the result in matrix diff  
        for(int i = 0; i < rows; i++){  
            for(int j = 0; j < cols; j++){  
                diff[i][j] = a[i][j] - b[i][j];  
            }  
        }  
  
        System.out.println("Subtraction of two matrices: ");  
        for(int i = 0; i < rows; i++){  
            for(int j = 0; j < cols; j++){  
               System.out.print(diff[i][j] + " ");  
            }  
            System.out.println();  
        }  
    }  
}    