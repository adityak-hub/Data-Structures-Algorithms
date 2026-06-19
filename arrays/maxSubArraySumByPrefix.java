package arrays;

public class maxSubArraySumByPrefix {
    public static void maxSubArray(int arr[]) {
        int maxsum= Integer.MIN_VALUE;
        int currSum=0;

        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        // calculate prefix sum for an prefix array
        for(int i=1; i<prefix.length; i++){
            prefix[i]=prefix[i-1] + arr[i];
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){

                currSum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];
                if(currSum>maxsum){
                    maxsum=currSum;
                }
            }
        }
        System.out.println("maxsum of subarray: "+maxsum);
    }
    
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        maxSubArray(arr);
    }
    
}
