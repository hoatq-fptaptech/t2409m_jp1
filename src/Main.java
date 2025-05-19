public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int x = 10;
        float y = 3.14f;
        double z = 3.14;
        String s = "Hello world!";
        boolean b = true;
        System.out.println("x=" + x);

        if(x >= 10){
            System.out.println("A");
        } else if (x >=5) {
            System.out.println("B");
        } else if (x < 5) {
            System.out.println("C");
        }else{
            System.out.println("D");
        }

        switch (x){
            case 10:
                System.out.println("X");break;
            case 5:
                System.out.println("Y");break;
            default:
                System.out.println("Z");
        }

        for (int i=0;i<10;i++){
            System.out.println("i= "+i);
        }

        while (x<=15){
            x++;
            System.out.println("x="+x);
        }

        int arr[] = new int[10]; // khai bao 1 mang so nguyen 10 phan tu
        arr[0] = 15;
        arr[1] = 5;
    }
}