package oops.abstraction;

public class superKeyword{
    public static void main(String[] args) {
        Human h = new Human();
        System.out.println(h.color);
        
    }
}

class Mammal{    //immediate parent class
    String color;
    Mammal(){
        System.out.println("Mammal constructor is called");
    }
}

class Human extends Mammal{
    
    Human(){
        super.color="brown"; //isse hmare Mammal class ka constructor call ho jaayega
        System.out.println("Human constructor is called");
    }
}