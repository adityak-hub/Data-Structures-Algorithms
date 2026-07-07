package oops.constructor;

public class nonParameterizedConstructor{
    public static void main(String[] args) {
        Student2 s1 = new Student2();

    }
}

class Student2{
    String name;
    int roll;

    Student2(){      // A constructor created by the programmer that has no parameters.
        System.out.println("constructor is called...");
    }
}