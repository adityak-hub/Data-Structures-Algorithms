package loops;
import java.util.*;


public class whileLoops_sumOfNNaturalNumbers{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        int count = 0;
        int sum =0;
        while(count <=n){
            sum=sum+count;
            count++;
        }
        System.out.print(sum);
    }
}






