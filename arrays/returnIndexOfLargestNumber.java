package arrays;

public class returnIndexOfLargestNumber {
    public static int returnIndexOfLargestNumber(int arr[]){
        int largest = arr[0];
        int index =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
             largest=arr[i];
             index=i;
            }
        }
        return index;
        

    }
    public static void main(String[] args) {
        int arr[] = {1,3,9,1,2,0,4,2};
        int index = returnIndexOfLargestNumber(arr);
        System.out.println("the index of largest number: "+index);
        
    }
}
