package OOPS;

public class Nested_Catch {
    public static void main(String[] args) {
        try {
            int C = 10 / 0;
            System.out.println("Division is: " + C);
        } catch (ArithmeticException e) {
            System.out.println("Can't Divide By Zero");
            try {
                int Array[] = { 1, 2, 3, 4 };
                System.out.println("Element is: " + Array[10]);
            } catch (ArrayIndexOutOfBoundsException i) {
                System.out.println("Index Nai");
            }
        }
        System.out.println("Execution Done");
    }
}
