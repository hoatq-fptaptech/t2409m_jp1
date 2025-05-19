import java.util.Scanner;

public class Demo {
    public static void main(String[] args){
        // nhập thông tin sinh viên sau đó in ra thông tin vừa nhập
        String name;
        int age;
        // input thong tin sinh vien
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap ten sinh vien:");
        name = sc.nextLine();
        System.out.println("Vui long nhap tuoi sinh vien:");
        age = sc.nextInt();
        // output thong tin sinh vien
        System.out.println("Sinh vien: "+name+ " - tuoi:"+age);
    }
}
