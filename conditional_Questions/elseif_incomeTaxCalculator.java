package conditional_Questions;
import java.util.*;
public class elseif_incomeTaxCalculator {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income");;
        int income = sc.nextInt();
        if(income<=500000){
            System.out.print("no tax");
        }else if(income>500000 && income <=1000000){
            System.out.print((int)(0.2*income));
        }else{
            System.out.print((int)(0.3*income));
        }
    }
    
}
