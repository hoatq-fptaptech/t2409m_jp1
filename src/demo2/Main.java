package demo2;

import demo3.Man;

public class Main {
    public static void main(String[] args){
        Car c1 = new Car();
        c1.brand = "BMW";
        c1.year = 2024;
        c1.color = "Pink";
        c1.run();
        c1.run(80);
        c1.speedUp();

        SportCar sc1 = new SportCar();
        sc1.brand = "Honda";
        sc1.year = 2022;
        sc1.color = "Red";
        sc1.nitro = "N2";
        sc1.run();
        sc1.speedUp();
        Man m = new Man();
        m.drink();
    }
}
