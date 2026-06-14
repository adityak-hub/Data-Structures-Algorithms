package function;
import java.util.*;

public class decimalToBinary {
    public static void decimalToBinary(int decnum){
        int mynum = decnum;
        int pow=0;
        int binnum = 0;
        while(decnum >0){
            int rem = decnum%2;
            binnum = binnum +(rem*(int)Math.pow(10,pow));
            pow++;
            decnum = decnum/2;
        }
        System.out.println("The decimal of "+mynum+": "+binnum);
    }
    public static void main(String[] args) {
        decimalToBinary(12);
        
    }
    
}
