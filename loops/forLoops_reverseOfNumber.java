package loops;
import java.util.*;

public class forLoops_reverseOfNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();

        while(n>0){
            int lastDigit = n%10;
            System.out.print(lastDigit);
            n = n/10;

        }
        
    }
}
