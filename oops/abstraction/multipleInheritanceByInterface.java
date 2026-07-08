package oops.abstraction;

public class multipleInheritanceByInterface{
    public static void main(String[] args) {
        Bear b = new Bear();
        b.eatGrass();
        b.eatMeat();
    }
}

interface herbivorous{
    void eatGrass();
}

interface carnivorous{
    void eatMeat();
}


class Bear implements herbivorous,carnivorous{
    public void eatGrass(){
        System.err.println("bear eat grass");
    }

    public void eatMeat(){
        System.err.println("bear eat Meat also");
    }
}