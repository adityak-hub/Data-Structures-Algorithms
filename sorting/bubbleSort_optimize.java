package sorting;

public class bubbleSort_optimize {
    public static void bubbleSort(int arr[]) {
        for(int turn=0; turn<arr.length-1; turn++){
    
          int swap = 0;

           for(int j=0; j<arr.length-1-turn; j++){

              if(arr[j] > arr[j+1]){

                 swap++;

                 int temp = arr[j];
                 arr[j] = arr[j+1];
                  arr[j+1] = temp;
               }
            }

             if(swap == 0){      //Agar Turn 0 mein ek bhi swap nahi hua, toh array already sorted prove ho gaya.
               break;
        }
}   }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        bubbleSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    
}
