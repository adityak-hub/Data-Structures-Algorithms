package arrays;

public class arraysInFunctionCallByReference {
    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {89,98,90,99};
        update(marks);

        for(int i=0; i<marks.length; i++){      // arrays are call by reference (changes will also happen in main function)
            System.out.println(marks[i]);
        }
        

    }
    
}
