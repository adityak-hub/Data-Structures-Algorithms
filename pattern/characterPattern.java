package pattern;

public class characterPattern {
    public static void main(String[]args){
        int n=5;
        char ch = 'A';
        for(int i=1; i<=4; i++){
            for(int chars=1; chars<=i; chars++){   //inner loop how many times character will print
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    
}
