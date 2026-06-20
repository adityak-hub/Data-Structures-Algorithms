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

/* public class inbuiltSort {
    public static void main(String[] args) {
        int arr[] ={5,4,0,1,3,2};
        Arrays.sort(arr,1,4);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
    
}
*/



// dorting in descending order by collection method

/* import java.util.Collections;

public class inbuiltSort {
    public static void main(String[] args) {
        Integer arr[] ={5,4,0,1,3,2};   //ab ye arr Integer class ka object hai primitive(basic) int pe ye collection kaam nhi karta
        Arrays.sort(arr,Collections.reverseOrder());
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
    
}
*/




import java.util.Collections;
public class inbuiltSort {
    public static void main(String[] args) {
        Integer arr[] ={5,4,0,1,3,2};   
        Arrays.sort(arr,2,arr.length,Collections.reverseOrder());
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
    
}

