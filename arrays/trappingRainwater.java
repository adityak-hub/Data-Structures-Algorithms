package arrays;

public class trappingRainwater {
    public static int trappinfRainwater(int height[]) {
        int width=1;
        int n=height.length;

        // leftmax array
        int leftmax[] = new int[n];

        leftmax[0]=height[0];
        for(int i=1; i<n; i++){
            leftmax[i] = Math.max(height[i],leftmax[i-1]);
        }

        // rightmax array;
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightmax[i] = Math.max(height[i],rightmax[i+1]);
        }

        //trapped water
        int trappedwater=0;

        for(int i=0; i<n; i++){
            int waterlevel = Math.min(leftmax[i],rightmax[i]);

            trappedwater = trappedwater+ (waterlevel-height[i])*width;
        }
        return trappedwater;

        
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        int trappedwater=trappinfRainwater(height);
        System.out.println(trappedwater);
        
    }
    
}
