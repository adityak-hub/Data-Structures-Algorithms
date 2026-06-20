package sorting;
import java.util.Arrays;  // we can use *(full package access) instead of Arrays 

/* public class inbuiltSort {
    public static void main(String[] args) {
        int arr[] ={5,4,0,9,1,3,2};
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
    
}
    */



//sorting by index(arr,si,ei);

public class inbuiltSort {
    public static void main(String[] args) {
        int arr[] ={5,4,0,1,3,2};
        Arrays.sort(arr,1,4);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
    
}
