package arrays;

public class maxSubArraySumByKadanes {
    public static void maxSubArray(int arr[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0; i<arr.length; i++){
            cs += arr[i];
            if(cs<0){
                cs=0;
            }
            ms = Math.max(ms,cs);   // for compare
        }
        System.out.println(ms);
        
    }
    public static void main(String[] args) {
        int arr[] = {-1,-2,-3,-4};
        maxSubArray(arr);
    }
    
}
