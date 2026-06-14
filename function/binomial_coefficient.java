package function;
import java.util.*;

public class binomial_coefficient{
    public static int binomialCofficient(int n,int r){
        int nfact = factorial(n);
        int rfact = factorial(r);
        int nmrfact = factorial(n-r);
        int bincoff = (nfact)/(rfact*nmrfact);
        
        return bincoff;


    }
    public static int factorial(int num){
        
        int fact=1;
        for(int i=1; i<=num; i++){
            fact = fact*i;
        }
        return fact ; 

    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();
        int result = binomialCofficient(n, r);
        System.out.println(result);


        
        

    }
}