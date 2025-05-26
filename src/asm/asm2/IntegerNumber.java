package asm.asm2;

public class IntegerNumber extends MyNumber{
    int value;

    @Override
    MyNumber add(MyNumber other) {
        IntegerNumber total = new IntegerNumber();// tạo ra 1 object để tính tổng
        IntegerNumber o = (IntegerNumber)other; // eps kiểu tham số về dạng số nguyên
        total.value = this.value + o.value;// tính tổng
        return total;// trả về kết quả
    }

    @Override
    MyNumber subtract(MyNumber other) {
        return super.subtract(other);
    }

    @Override
    MyNumber multiply(MyNumber other) {
        return super.multiply(other);
    }

    @Override
    MyNumber divide(MyNumber other) {
        return super.divide(other);
    }

    @Override
    public String toString() {
        return this.value+"";
    }
}
