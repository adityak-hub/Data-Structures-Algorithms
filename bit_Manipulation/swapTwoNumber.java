package bit_Manipulation;

public class swapTwoNumber {
    public static void main(String[] args) {
        int x = 3, y=4 ;

        x = x^y;     //we use xor rule x^x=0 and x^0=x   and there happening algebra substituion    
        y = x^y;
        x = x^y ;
        System.out.println("the value of x: "+x+" "+"and y: "+y);
    }
    
}


/*
x = 3 ^ 4

Ab second line

y = x ^ y

Substitute karo

=(3 ^ 4) ^ 4

Ab XOR ka rule

4 ^ 4 = 0

To

3 ^ 0 = 3

Mil gaya

y = 3
*/



/*
x=x^y  --eq1    x=3^4
y=x^y  --eq2              substitute eq1 in eq2

y=(3^4)^4
y=3^(4^4)    *x^x=0
y=3^0    *x^0=x
y=3      --eq3

x=x^y   --eq4     substitute eq1 and eq3 in eq4

x=(3^4)^3
x=(3^3)^4
x=4^0
x=4

----x=4 , y=3 
*/
