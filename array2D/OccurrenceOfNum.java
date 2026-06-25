package array2D;

public class OccurrenceOfNum {
    public static int occurrenceOfNum(int matrix[][],int key) {
        int count=0;
        for(int i=0; i<=matrix.length-1; i++){
            for(int j=0; j<=matrix[0].length-1; j++){
                if(key==matrix[i][j]){
                    count++;
                }

            }
        }
        return count;
        
    }
    public static void main(String[] args) {
        int matrix[][]= {{1,7,8},{7,8,7}};
        int key=7;
        System.out.println(occurrenceOfNum(matrix, key));
    }
    
}
