package oops;



public class classAndObjects {
    public static void main(String[] args) {
        Pen p1 = new Pen();   //created a pen object  called p1
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color="yellow";     //we can directly acces property without function call
        System.out.println(p1.color);


    }
    
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int age;
    int percantage;

    void calPercantage(int phy, int chem, int maths){
        percantage = (phy+chem+maths)/3;
    }
}



