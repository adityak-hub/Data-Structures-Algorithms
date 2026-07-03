package bit_Manipulation;

public class checkNumberIsPowerOfTwoOrNot {
    public static boolean checkPowerOfTwo(int n) {
        return (n&(n-1))==0;   //property of find out power of two in bits.
    }
    public static void main(String[] args) {
        System.out.println(checkPowerOfTwo(4));
    }
    
}
