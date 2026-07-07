package oops.polymorphism;

public class methodOverriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();  // it calls child class function not parent class
    }
}

//base class or parent class
class Animal{
    void eat(){
        System.out.println("eat anything");
    }
}

//derived class or child class
class Deer{
    void eat(){
        System.out.println("eat grass");
    }
}

//both have same function but different work(definition).

