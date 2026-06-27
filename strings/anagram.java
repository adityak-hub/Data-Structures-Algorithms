package strings;
import java.util.*;

public class anagram {
    public static void main(String[] args) {
        String str1="heart";
        String str2="earth";
        
        //convert in lowercase becauze of not to check for lower or upper
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length()==str2.length()){
            
            //conver string into character array
            char str1ChArray[] = str1.toCharArray();
            char str2ChArray[] = str2.toCharArray();
            

            //for compare we sort these arrays by arrays method
            Arrays.sort(str1ChArray);
            Arrays.sort(str2ChArray);
            

            //take boolean value by compare short array with the help of arrays function
            boolean result = Arrays.equals(str1ChArray,str2ChArray);
            if(result==true){
                System.out.println("str1 and str2 is anagram");
            }else{
                System.out.println("str1 and str2 is not anagram");
            }

        }else{
            System.out.println("str1 and str2 is not anagram");
        }

         
    }
    
}
