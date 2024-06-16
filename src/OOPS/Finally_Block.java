package OOPS;

public class Finally_Block {
    public static void main(String[] args) {
        int A = 10, B = 2;
        try {
            int C = A / B;
            System.out.println("Division is: " + C);
        } catch (ArithmeticException e) {
            System.out.println("Can't Divide By Zero");
        } finally {
            System.out.println("Finally Block To Handle The Resources");
        }
    }
}
