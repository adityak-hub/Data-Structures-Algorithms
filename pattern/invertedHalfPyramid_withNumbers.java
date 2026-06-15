package pattern;

public class invertedHalfPyramid_withNumbers {
    public static void invertedHalfPyramidwithNumbers(int n){
        //outer loop-- for lines
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        invertedHalfPyramidwithNumbers(5);
        
    }
    
}
