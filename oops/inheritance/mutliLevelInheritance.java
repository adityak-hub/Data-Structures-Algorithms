//A child class becomes the parent of another class.

package oops.inheritance;

public class mutliLevelInheritance {
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs=4;
        System.out.println(dobby.legs);

    }
}

class Animalll{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("breath");
    }
}

class Mammalll extends Animalll{
    int legs;

}

class Dog extends Mammalll{
    String breed;
}
