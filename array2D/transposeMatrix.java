package array2D;

public class transposeMatrix {
    public static void transposeMatrix(int matrix[][]) {
        int transpose[][] = new int[matrix.length][matrix[0].length];
        for(int i=0; i<=matrix.length-1; i++){
            for(int j=0; j<=matrix[0].length-1; j++){
                transpose[j][i]=matrix[i][j];
            }
        }


        for(int i=0; i<=transpose.length-1; i++){
            for(int j=0; j<=transpose[0].length-1; j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{3,7,9},{0,1,8},{2,6,4}};
        transposeMatrix(matrix);
        
    
    }
    
}
