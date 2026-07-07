//Hybrid inheritance means using more than one type of inheritance together in the same program.
// ex--Since hierarchical and multilevel inheritance are used together, it is called hybrid inheritance.
package oops.inheritance;

public class hybridInheritance {
    public static void main(String[] args) {
        Peacock peacock = new Peacock();
        peacock.color = "white";
        System.out.println(peacock.color);

        Human human  = new Human();
        human.intelligence();
        
    }
}

//base class or parent class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("breath");
    }
}

//derived class of Animal
class Fish extends Animal{
    void swim(){
        System.out.println("swim");
    }
}

//derived class of Animal
class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}


//derived class of Animal
class Mammal extends Animal{
    void walk(){
        System.out.println("walk");
    }
}
 

//derived classs of Fish
class Shark extends Fish{
    void noBones(){
        System.out.println("no bones");
    }
}
class Tuna extends Fish{
    void tase(){
        System.out.println("tasty");
    }
}

//derived class of Bird
class Peacock extends Bird{
    void beautiful(){
        System.out.println("beautiful");
    }
}


//derived class of Mammal
class Human extends  Mammal{
    void intelligence(){
        System.err.println("intelligence");
    }
}
class Dog extends  Mammal{
    void loyalty(){
        System.err.println("loyalty");
    }
}


