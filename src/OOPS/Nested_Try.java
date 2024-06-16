package OOPS;

public class Nested_Try {
    public static void main(String[] args) {
        int A = 10, B = 0;
        try {
            try {
                int[] Array = { 1, 2, 3, 4, 5 };
                int Div = Array[10] / 0;
                System.out.println("Division is: " + Div);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Index Nai");
            }
            int C = A / B;
            System.out.println("Divison is: " + C);
        } catch (ArithmeticException e) {
            System.out.println("Can't Divide By Zero");
        }
        System.out.println("Execution Successful");
    }
}
