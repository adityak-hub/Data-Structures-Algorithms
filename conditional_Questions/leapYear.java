package conditional_Questions;
import java.util.*;

public class leapYear {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Year: ");
        int n = sc.nextInt();
        if((n%4==0 && n%100 !=0)||n%400==0){
            System.out.print("Leap year");
        }else{
            System.out.print("not a leap year");
        }


    }
}
