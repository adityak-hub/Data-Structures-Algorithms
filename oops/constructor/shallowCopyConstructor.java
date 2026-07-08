package oops.constructor;

public class shallowCopyConstructor {
    public static void main(String[] args) {
        Studentt s1 = new Studentt();
        s1.name = "aditya";
        s1.roll=456;
        s1.password = "abcd";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;

        Studentt s2 = new Studentt(s1);   //copy s1 in s2
        s2.password = "xyz";
        s1.marks[2]=100;
        for(int i=0; i<=2; i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Studentt{
    String name;
    int roll;
    int marks[];
    String password;
  
    //It is shallow copy constructor  because it copy references
    Studentt(Studentt s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }
     Studentt(){
        marks = new int[3];
        System.out.println("constructor is called...");
    }
}
