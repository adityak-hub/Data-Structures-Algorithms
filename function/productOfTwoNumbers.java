package function;
import java.util.*;

public class productOfTwoNumbers {
    public static int calculateProduct(int num1,int num2){
        int prod = num1*num2 ;
        return prod;

    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int a = sc.nextInt();
        System.out.print("Enter your second number: ");
        int b = sc.nextInt();
        int prod = calculateProduct(a,b);
        System.out.print("the product of two numbers: "+ prod);
        
    }
    
}
