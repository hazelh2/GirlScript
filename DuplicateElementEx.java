public class DuplicateElementEx {  
    public static void main(String[] args) {      
          
        int [] arr = new int [] {13,57,2,92,57,8,2,12,12};   
          
        System.out.println("Duplicate elements in given array: ");  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
    }  
}  