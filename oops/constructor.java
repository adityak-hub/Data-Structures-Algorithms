package oops;

public class constructor{
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        
        Student1 s2 = new Student1("aditya");
        System.out.println(s2.name);
    }
}


class Student1{
    String name;
    int roll;

    Student1(String name){  //this is constructor it doen't have return type and it is same as class
        
        this.name = name;
    }
    Student1(){  //this is constructor it doen't have return type and it is same as class
        
        System.out.println("constructor is calling..");
    }
}