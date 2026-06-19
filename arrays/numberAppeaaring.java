package arrays;

public class numberAppeaaring {
    public static boolean numberAppears(int nums[]) {

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
        
    }
    public static void main(String[] args) {
        int nums[] = {0,0,0,0};
        boolean result =numberAppears(nums);
        System.out.println(result);
    }
    
}
