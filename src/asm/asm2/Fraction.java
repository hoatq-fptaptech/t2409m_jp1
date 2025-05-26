package asm.asm2;

public class Fraction extends MyNumber{
    int numerator;
    int denominator;
    @Override
    MyNumber add(MyNumber other) {
        Fraction total = new Fraction();
        Fraction o = (Fraction) other;
        total.denominator = this.denominator * o.denominator;
        total.numerator = this.numerator * o.denominator + this.denominator * o.numerator;
        return total;
    }
    @Override
    public String toString() {
        return this.numerator+ "/"+ this.denominator;
    }
}
