package array2D;

public class sumOf2ndRow {
    public static int sumOf2ndRow(int matrix[][]) {
        int sum=0;
            for(int j=0; j<=matrix[1].length-1; j++){
                sum+= matrix[1][j];

            }
        
        return sum;
        
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,4,9},{11,4,3},{2,2,3}};
        System.out.println(sumOf2ndRow(matrix));
        
    }
    
}
