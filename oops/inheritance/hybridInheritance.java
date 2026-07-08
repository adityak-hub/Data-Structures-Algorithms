//Hybrid inheritance means using more than one type of inheritance together in the same program.
// ex--Since hierarchical and multilevel inheritance are used together, it is called hybrid inheritance.
package oops.inheritance;

public class hybridInheritance {
    public static void main(String[] args) {
        Peacock peacock = new Peacock();
        peacock.color = "white";
        System.out.println(peacock.color);

        Humann Humann  = new Humann();
        Humann.intelligence();
        
    }
}

//base class or parent class
class Animals{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("breath");
    }
}

//derived class of Animals
class Fishh extends Animals{
    void swim(){
        System.out.println("swim");
    }
}

//derived class of Animals
class Birdd extends Animals{
    void fly(){
        System.out.println("fly");
    }
}


//derived class of Animals
class Mammall extends Animals{
    void walk(){
        System.out.println("walk");
    }
}
 

//derived classs of Fishh
class Sharkk extends Fishh{
    void noBones(){
        System.out.println("no bones");
    }
}
class Tuna extends Fishh{
    void tase(){
        System.out.println("tasty");
    }
}

//derived class of Birdd
class Peacock extends Birdd{
    void beautiful(){
        System.out.println("beautiful");
    }
}


//derived class of Mammall
class Humann extends  Mammall{
    void intelligence(){
        System.err.println("intelligence");
    }
}
class Dog extends  Mammall{
    void loyalty(){
        System.err.println("loyalty");
    }
}


