package bit_Manipulation;

public class evenOdd {
    public static void evenOdd(int n) {
        int bitMask = 1;
        if((n & bitMask)==0){
            //even number
            System.out.println("number is even");
        }else{
            System.out.println("number is odd");
        }
    
    }
    public static void main(String[] args) {
        evenOdd(3);
        evenOdd(4);
        evenOdd(2);
        evenOdd(0);
    }
    
}
