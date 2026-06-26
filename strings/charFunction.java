package strings;

public class charFunction {
    public static void searchLetter(String str) {
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
        
    }
    public static void main(String[] args) {
        String str = "Aditya Kumar";
        searchLetter(str);
    }
    
}
