package bit_Manipulation;

public class convertUppercaseIntoLowercase {
    public static void main(String[] args) {
        // convert uppercase character to lowercase

        for(char ch='A'; ch<='Z'; ch++){
            System.out.print((char)(ch | ' '));
        }
    }
    
}
