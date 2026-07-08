//One child class inherits from one parent class.

package oops.inheritance;

public class singleLevelInheritance {
    public static void main(String[] args) {
        Fishhh Sharkkk = new Fishhh();
        Sharkkk.eat();
    }
}




//base class or parent class
class Animallll{
    String color;
    void breath(){
        System.out.println("breaths");
    }

    void eat(){
        System.out.println("eats");
    }
}


//derived class or subclass or child class
class Fishhh extends Animallll{
    int fins;

    void swim(){
        System.out.println("swim");
    }
}
