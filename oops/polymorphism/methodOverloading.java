package oops.polymorphism;

import array2D.searchKeyInSortedMatrix;

public class methodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(3,5));
        System.out.println(calc.sum(3.4f,5.2f)); //or float(3.4),float(5.2)
        System.out.println(calc.sum(3,5,9));
    }
}

class Calculator{
    int sum(int a,int b){
        return a+b;
    }

    float sum(float a, float b){
        return a+b;
    }

    int sum(int a,int b,int c){
        return a+b+c;
    }
}
