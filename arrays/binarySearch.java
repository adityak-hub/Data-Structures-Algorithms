package arrays;

public class binarySearch{
    public static int binarySearch(int arr[],int key) {

        int start=0  , end=arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;

            //comparison
            if(key==arr[mid]){ //found
                return mid; 

            }if(key<arr[mid]){
                end = mid-1;     // 2st half
            }else{
                start = mid+1;  // 2nd half
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12};
        int key=2;
        int index = binarySearch(arr, key);
        System.out.println(index);
    }
    
}