package demo4;

public class Dog {
    private String kind;
    private String color;
    private int price;

    public Dog() {
    }
    public Dog(String kind, String color, int price) {
        this.kind = kind;
        this.color = color;
        this.price = price;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
