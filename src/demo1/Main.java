package demo1;

public class Main {
    // program
    public static void main(String[] args){
        Student s1 = new Student("Dinh Quang Thai",19,"09876543456","8A Ton That Thuyet"); // tao ra 1 object từ class Student
//        s1.name = "Dinh Quang Thai";
//        s1.age = 19;
//        s1.telephone = "09876543456";

        Student s2 = new Student("Dinh Van Luc",19,"0828282922","12 Quang Trung");
//        s2.name = "Dinh Van Luc";
//        s2.age = 19;
//        s2.telephone = "0828282922";
        s2.girlFriend = "Tran Ha Linh";

        s1.run();
        s2.run();

        s1.eat();
        s2.learn();

        Number a = new Number();
        a.n = 199;
        a.ktChanLe();

        Tamgiac tg = new Tamgiac(3,4,5);
        int v = tg.chuvi();
        System.out.println("CHu vi: "+v);
        Tamgiac tg2 = new Tamgiac(5,6,7);
        if(tg2.dientich() > tg.dientich()){

        }
    }
}
