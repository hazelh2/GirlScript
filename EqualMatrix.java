public class EqualMatrix    
{    
    public static void main(String[] args) {    
        int row1, col1, row2, col2;    
        boolean flag = true;    
            
        //Initialize matrix a    
        int a[][] = {       
                        {0, 3, 8},    
                        {3, 9, 2},    
                        {1, 6, 0}    
                    };    
              
          //Initialize matrix b    
        int b[][] = {       
                        {5, 10, 7},    
                        {1, 2, 8},    
                        {8, 7, 1}    
            };    
              
        //Calculates the number of rows and columns present in the first matrix    
    
          row1 = a.length;    
        col1 = a[0].length;    
            
        //Calculates the number of rows and columns present in the second matrix    
    
          row2 = b.length;    
        col2 = b[0].length;    
            
        //Checks if dimensions of both the matrices are equal    
        if(row1 != row2 || col1 != col2){    
            System.out.println("Matrices are not equal");    
        }    
        else {    
            for(int i = 0; i < row1; i++){    
                for(int j = 0; j < col1; j++){    
                  if(a[i][j] != b[i][j]){    
                      flag = false;    
                      break;    
                  }    
                }    
            }    
                
            if(flag)    
                System.out.println("Matrices are equal");    
            else    
                System.out.println("Matrices are not equal");    
        }    
    }    
}    