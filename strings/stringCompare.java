package strings;

public class stringCompare {
    public static void main(String[] args) {
        String s1 = "tony";
        String s2 = "tony";
        String s3 = new String("tony");

        if(s1==s2){
            System.out.println("string is equals");
        }else{
            System.out.println("not equals");
        }


        System.out.println("----------------");
        if(s1==s3){  // due to intern pool or String pool when string is not created by new keyword then string show old string with thier previous memory address,but new keyword create new memory address for their string this is called inteer pool.
            System.out.println("string is equals");
        }else{
            System.out.println("not equals");
        }



        System.out.println("-----------");

        if(s1.equals(s3)){
            System.out.println("string is equals");
        }else{
            System.out.println("not equals");
        }
    }
    
}



/*

"Tony" is stored in the String Pool.
s1 and s2 both point to the same memory location.
== compares references (addresses), not content.



new String("Tony") creates a new object in heap memory.
s3 gets a different reference.
Contents are the same, but addresses are different.




String Pool (Intern Pool):
A special memory area where Java stores string literals. If the same string literal already exists, Java reuses the existing object instead of creating a new one.

new String()
Always creates a new object in heap memory, even if the same string already exists in the String Pool.


Because equals() compares the actual characters, not the memory addresses.

One-line Viva Answer
== → compares memory addresses (references).
equals() → compares string contents.
String literals are stored in the String Pool and reused.
new String() creates a separate object in heap memory.

*/