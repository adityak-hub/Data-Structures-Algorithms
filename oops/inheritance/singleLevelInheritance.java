//One child class inherits from one parent class.

package oops.inheritance;

public class singleLevelInheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }
}




//base class or parent class
class Animal{
    String color;
    void breath(){
        System.out.println("breaths");
    }

    void eat(){
        System.out.println("eats");
    }
}


//derived class or subclass or child class
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swim");
    }
}
