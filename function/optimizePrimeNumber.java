package function;

public class optimizePrimeNumber {
     public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        
        for(int  i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){     //completely divide
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        System.out.println(isPrime(4));

    }
    
}
