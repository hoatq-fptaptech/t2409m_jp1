package demo1;

public class Tamgiac {
    int a;
    int b;
    int c;

    public Tamgiac(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    int chuvi(){
        int cv = this.a + this.b + this.c;
//        System.out.println("CHu vi: "+cv);
        return cv;
    }

    double dientich(){
        double p = chuvi() / 2.0;
        double s = Math.sqrt(p* (p-this.a) * (p-this.b) * (p-this.c));
        return s;
    }
}
