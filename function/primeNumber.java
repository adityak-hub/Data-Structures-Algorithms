package function;

public class primeNumber {
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        
        for(int  i=2; i<=n-1; i++){
            if(n%i==0){     //completely divide
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        System.out.println(isPrime(1));

    }
    
}
