
package arrays;

public class rotatedSortedArray {
    public static int rotatedSortedArray(int nums[],int target) {
        int start =0 , end = nums.length-1;

        while(start <=end){
            int mid = (start+end)/2;
            
            //target found
            if(target==nums[mid]){
                return mid;
            }
            // check left side is sorted or not
            if(nums[start]<=nums[mid]){

                //check if target lies inside left sorted half
                if(target >=nums[start] && target <nums[mid]){
                    //search in left half
                    end=mid-1;
                }else{
                    // search in right half
                    start = mid+1;
                }
            }
            //otherwise right half must be sorted
            else{

                // check if target lies inside right sorted half
                if(target >nums[mid] && target <= nums[end]){

                    // search in right half
                    start = mid+1;
                }else{

                    // search in left half
                    end = mid-1;
                }
            }

        }
        //target not found
        return -1;
        
    }
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        int target = 0;
        int result = rotatedSortedArray(nums, target);
        System.out.println(result);
    }
    
}
