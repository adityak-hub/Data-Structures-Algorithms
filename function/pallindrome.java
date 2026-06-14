package function;

public class pallindrome {
    public static void pallindrome(int n){
        int newnum = n;
        int NR = 0;
        while(n>0){
         int lastdigit = n%10;
         NR= lastdigit+(NR*10); 
         n = n/10;
        }
        if(NR==newnum){
            System.out.println("pallindrome");
         }else{
            System.out.println("not pallindrome");
        }
        
        
    }
    public static void main(String[] args) {
        pallindrome(121);
        
    }
    
}
