package arrays;

public class largestNumber {
    public static int  largestNumber(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
         if(largest<arr[i]){
            largest = arr[i];
            
         }
         
        }
        return largest;
        
    }
        
    
    public static void main(String[] args) {
        int arr[] = {9,5,4,0,3,9,10};
        int index =largestNumber(arr);
        System.out.println("index of largest number: "+index);
        
    }
    
}
