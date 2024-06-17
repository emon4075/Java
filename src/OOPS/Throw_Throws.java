package OOPS;

public class Throw_Throws {
    void Div(int A, int B) throws ArithmeticException {
        if (B == 0) {
            throw new ArithmeticException();
        } else {
            int C = A / B;
            System.out.println("Division is: " + C);
        }
    }

    public static void main(String[] args) throws ArithmeticException {
        Throw_Throws Obj = new Throw_Throws();
        Obj.Div(10, 0);
    }
}
