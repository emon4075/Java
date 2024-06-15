package OOPS;

class Encap {
    private int Value;

    public void getValue(int A) {
        Value = A;
    }

    public int showValue() {
        return Value;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Encap Obj = new Encap();
        Obj.getValue(10);
        System.out.println("The Value is: " + Obj.showValue());
    }
}
