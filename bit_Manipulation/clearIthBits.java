package bit_Manipulation;

public class clearIthBits {
    public static int clearIthBits(int n, int i) {
        int bitmask = (-1)<<i;   //-1(~0) ka means all one ex-- 111111111111

        return n & bitmask ;

    }
    public static void main(String[] args) {
        System.out.println(clearIthBits(7, 2));
        
    }
    
}
