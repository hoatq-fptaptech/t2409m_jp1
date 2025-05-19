import java.util.Scanner;

public class Odd {
    public static void main(String[] args){
        // viết chương trình nhập vào 1 số nguyên và kiểm
        // tra xem là số chẵn hay số lẻ.
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap n:");
        n = sc.nextInt();

        if(n%2==0){
            System.out.println("Đây là số chẵn");
        }else {
            System.out.println("Đây là số lẻ");
        }

        int gt = 1;
        int s=0;
        for(int i=1;i<=n;i++){
            gt *= i;
            s+=i;
        }

        int u3 =1;
        for(int i = 2;i<n;i++){
            if(n%i == 0){
                u3 = i;
            }
        }
        if(u3 != 1){
            System.out.println("Đây không phải số nguyên tố");
        }else{
            System.out.println("Đây là số nguyên tố");
        }

    }
}
