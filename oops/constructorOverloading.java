/*
Constructor Overloading (Definition)
Constructor overloading means creating multiple constructors in the same class with different parameters so that objects can be created in different ways.
The constructors must differ in:

Number of parameters, or
Type of parameters, or
Order of parameters



Why do we use Constructor Overloading?

Suppose you want to create a Student object.
Sometimes you only know the student's name.
Sometimes you know the name and age.
Sometimes you know the name, age, and course.
Instead of creating different classes, you create multiple constructors.



*/

package oops;


public class constructorOverloading{
    public static void main(String[] args) {
        Student4 s1= new Student4();
        Student4 s2= new Student4("kabir ahlawat");
        Student4 s3= new Student4("virat kholhi",35);
        System.out.println(s2.name);
        System.out.println(s3.name);
        System.out.println(s3.age);
        
    }   
}


class Student4{

    String name;
    int age;

    //constructor1
    Student4(){
        System.out.println("constructor is called...");
    }

    //constructor2
    Student4(String name){
       this.name = name;
       
    }

    //constructor3
    Student4(String name,int age){
        this.name = name;
        this.age = age;
    }

}

//Java automatically matches the constructor based on the arguments you pass.

//If you do not write any constructor in a class, the Java compiler automatically generates a default constructor.
//and there is no default constructor because alreday we wrote 3 constructor.