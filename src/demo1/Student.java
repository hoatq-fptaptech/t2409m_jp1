package demo1;

public class Student {
    String name;// attribute  field information ...
    int age;
    String telephone;
    String girlFriend;

    String address;
    // Constructor
    public Student(String n1, int a1, String t1, String adx){
        this.name = n1;
        this.age = a1;
        this.telephone = t1;
        this.address = adx;
        System.out.println("Constructor running....");
    }

    // method  behavior
    void eat(){
        System.out.println("Eating...");
    }

    void run(){
        System.out.println(this.name +" Running...");
    }

    void learn(){
        System.out.println("Learning....");
    }

}
