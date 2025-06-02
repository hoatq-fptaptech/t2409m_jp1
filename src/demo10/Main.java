package demo10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int a,b;
        int c;
        try {
            a = sc.nextInt();
            b = sc.nextInt();

            if(a < 10){
                // không cho chia
                throw new Exception("Nhập số vào vớ vẩn quá");// chủ động chuyển đến xử lý ngoại lệ
            }

            c = a / b; // nhâp vao a=2 b=0 -> lỗi
            System.out.println("c =" + c);
        }catch (ClassCastException e){
            System.out.println("Lỗi vớ vẩn gì đó!");
        }catch (ArithmeticException e){
            System.out.println("Có sai sót trong tính toán!");
        }catch (Exception e){  // xử lý ngoại lệ
            System.out.println("Xảy ra lỗi mất rồi: "+e.getMessage());
        }finally {
            // lúc nào nó cũng chay qua
        }

    }
}
