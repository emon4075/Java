package OOPS;

public class Multiple_Try_Catch {
    public static void main(String[] args) {
        int A = 10, B = 0;
        try {
            int C = A / B;
            System.out.println("Division is: " + C);
        } catch (ArithmeticException e) {
            System.out.println("Can't Divide By Zero");
        }
        try {
            int[] Array = { 1, 2, 3, 4, 5 };
            int Div = Array[10] / 3;
            System.out.println("Division is: " + Div);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index er baire bai");
        }
    }
}
