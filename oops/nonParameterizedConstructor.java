package oops;

public class nonParameterizedConstructor{
    public static void main(String[] args) {
        Student2 s1 = new Student2();

    }
}

class Student2{
    String name;
    int roll;

    Student2(){      // non Parameterized Constructor
        System.out.println("constructor is called...");
    }
}