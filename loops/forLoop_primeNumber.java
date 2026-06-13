package loops;
import java.util.*;

public class forLoop_primeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.print(n + " is not a prime number");
            
        }else{
            boolean isPrime = true;

         for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isPrime = false;
                
            }
         }

         if (isPrime==true) {
            System.out.print(n + " is a prime number");
         } else {
            System.out.print(n + " is not a prime number");
         }
        }

        
    }
}