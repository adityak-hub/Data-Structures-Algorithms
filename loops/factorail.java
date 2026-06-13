package loops;
import java.util.*;


public class factorail {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print("Enter your number: ");

        int fact = 1;
        for(int i=n; i>=1; i--){
            fact=fact*i;
        }
        System.out.print(fact);
    }
    
}
