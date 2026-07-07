package oops;

public class parameterizedConstructor {
    public static void main(String[] args) {
        Student3 s1 = new Student3("adani");
        System.out.println(s1.name);
    }
}


class Student3{
    String name;
    int roll;


    Student3(String name){
        this.name = name;
    }
}
