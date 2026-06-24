package array2D;

import java.util.Scanner;

public class searchKey {
    public static boolean searchKey(int matrix[][],int key) {
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==key){
                    System.out.print("key found at index :"+"("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("key is not found");
        return false;
        
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];

        int n = matrix.length , m = matrix[0].length;

        for(int i=0; i<n; i++){  //for rows
            for(int j=0; j<m; j++){   //for columns

                matrix[i][j]=sc.nextInt();
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        searchKey(matrix, 5);


    }
    
}


