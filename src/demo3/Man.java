package demo3;

public class Man {
    String name;
    private int age;

    public void drink(){
        this.name = "XMen";
        System.out.println("Drinking beer...");
    }
    private void married(){
        this.drink();
    }
}
