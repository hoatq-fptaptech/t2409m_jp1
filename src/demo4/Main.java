package demo4;

public class Main {
    public static void main(String[] args){
        Dog d = new Dog();
//        d.kind = "Alaska";
        d.setKind("Alaska");
        System.out.println("Đây là loại "+d.getKind());

        Dog d2 = new Dog("Husky","Pink",500);
    }
}
