package arrays;

public class maxSubarraySumBruteForce {
    public static void maxSubArray(int arr[]) {
        int sum=0;
        int maxsum= Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                sum =0;
                for(int k=i; k<=j; k++){
                    sum = sum+ arr[k];
                    if(maxsum<sum){
                        maxsum=sum;
                    }
                }
                System.out.println(sum);
            }
            System.out.println();
        }
        System.out.println("the maximum subarray: "+maxsum);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        maxSubArray(arr);
       
        
    }
    
}
