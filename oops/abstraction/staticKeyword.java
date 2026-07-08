package oops.abstraction;

public class staticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();  //jab aap Student class ka koi bhi object bna denge aur woh object tumhare school name ko declare kr deta hai toh woh baaki saare objects ke liye bhi declare ho jaayega.
        s1.schoolName="AMU";
        System.out.println(s1.schoolName);
        
        Student s2 = new Student(); 
        System.out.println(s2.schoolName);  //kayde se ismai ek empty string aani chaiye kyoki humne s2 ke liyo scholl declare hi nhi kiya but aesa nhi hoga jab code run hoga toh ye s1 ka schoolname print karega aesa isliye hota hai jis bhi varible ko hamne static bnaaya agr uski value koi bhi object khi bhi change kar dega toh woh sab  object ke liye change hogi.


        Student s3 = new Student(); 
        s3.schoolName="GLA";
        System.out.println(s3.schoolName);
        System.out.println(s2.schoolName);
    }
}

class Student{

    static int returnPercantage(int math, int chem, int phy){
        return (math+phy+chem)/3;
    }
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name=name;
    }

    String getName(){
        return this.name;
    }
}
