package demo9;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args){
//        ICar i = new ICar();

        CarDemo cd = new CarDemo();
        cd.speedUp();

        ICar ic = new ICar() {
            @Override
            public void speedUp() {
                System.out.println("ICar is speeding up..");
            }
        };
        ic.speedUp();

        // Lambda expression -> chỉ dùng được với functional interface
        ICar ic2 = ()->{
            System.out.println("ICar 2 is speeding up...");
        };
        ic2.speedUp();

        IBike ib = (s)->{
            System.out.println("Bike....");
        };
        ib.maintain("Hello");

        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        LocalDate nextDay = ld.plusDays(1);
        System.out.println(nextDay);
        LocalDate next2Day = ld.plusDays(2);
        System.out.println(next2Day);
        LocalDate next105Day = ld.plusDays(105);
        System.out.println(next105Day);
        System.out.println("Day:"+next105Day.getDayOfWeek());
        System.out.println("Day:"+next105Day.getDayOfYear());
        System.out.println("Day:"+next105Day.getDayOfMonth());

        LocalDate dob = LocalDate.of(2006,9,23);
        System.out.println("DOB: "+dob.getDayOfWeek());

        LocalDate dob2 = LocalDate.parse("2006-03-22");
        System.out.println("DOB2: "+dob2.getDayOfWeek());

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        LocalDateTime ldt2 = ldt.plusHours(2);
        // Viết chương trình đếm ngược số ngày đến tết
    }
}
