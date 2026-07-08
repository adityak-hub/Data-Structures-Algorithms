package oops.abstraction;

public class abstractClassAndMethods{
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        
        System.out.println(h.color); //brown color kyo ayya jabki dark brown aana tha becase jab hum child class ka object bnayenge tab sabse phle parent class ka constructor call hoga phir khudka constructor call hoga.
        
        h.changeColor();
        System.out.println(h.color);   //ab dark brown ho ga

        Chicken c = new Chicken();
        c.eat();
        c.walk();


    }
}

abstract class Animal{  //•abstract class woh class hoti hai jiske andar hum object nhi bna skte.
    String color;
    Animal(){
        color="brown";
    }
    void eat(){
        System.out.println("eats everything");
    }

    abstract void walk(); //•abstract method woh method hote hai jinmai implementation nhi hota.
    
}

class Horse extends Animal{
    void changeColor(){
        color="dark brown";
    }
    void walk (){
        System.out.println("horse walk on 4 legs");
    }
}

class Chicken extends Animal{

    void changeColor(){
        color="white";
    }
    void walk(){
        System.out.println("chicken walk on 2 legs");
    }
}



/*
Why does the parent constructor execute first?
"When a child object is created, Java first calls the parent class constructor using super() (implicitly if we don't write it). This initializes the parent part of the object before the child class is initialized."

*/


// hierarchical order of construct calling in abstract class.

/* 
public class abstractClassAndMethods{
    public static void main(String[] args) {
        Mustang myHorse = new Mustang();
        //Animal -> Horse -> Mustang

    }
}

abstract class Animal{  //•abstract class woh class hoti hai jiske andar hum object nhi bna skte.
    String color;
    Animal(){
        System.out.println("animal constructor called");
    }
    void eat(){
        System.out.println("eats everything");
    }

    abstract void walk(); //•abstract method woh method hote hai jinmai implementation nhi hota.
    
}

class Horse extends Animal{

    Horse(){
        System.out.println("horse constructor called");
    }
    void changeColor(){
        color="dark brown";
    }
    void walk (){
        System.out.println("horse walk on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("mustang constructor called");
    }
}

*/