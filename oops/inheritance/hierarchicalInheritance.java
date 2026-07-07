//Multiple child classes inherit from the same parent.

package oops.inheritance;

public class hierarchicalInheritance {
    public static void main(String[] args) {
        Bird sparrow = new Bird();
        sparrow.color="black";
        System.out.println(sparrow.color);
        sparrow.fly();
    }
}


class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("breath");
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("walks");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("swim");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}
