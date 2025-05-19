package demo1;

public class Number {
    int n;

    void ktChanLe(){
        if(n%2 == 0){
            System.out.println(n + " la so chan");
        }else{
            System.out.println(n + " la so le");
        }
    }
    void giaiThua(){
        int gt = 1;
        for(int i=1;i<=n;i++){
            gt *= i;
        }
        System.out.println(n+"! = "+gt);
    }
    void ktSNT(){
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
