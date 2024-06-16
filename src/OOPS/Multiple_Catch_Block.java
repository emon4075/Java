package OOPS;

public class Multiple_Catch_Block {
    @SuppressWarnings("null")
    public static void main(String[] args) {
        try {
            int A = 10, B = 2;
            int C = A / B;
            System.out.println("Division is: " + C);
            int[] Array = { 1, 2, 3, 4, 5 };
            System.out.println("Element From The Array: " + Array[10]);
            String Name = null;
            System.out.println("Upper-Case: " + Name.toUpperCase());
        } catch (ArithmeticException e) {
            System.out.println("Can't Divide By Zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index Chini Na Bai");
        } catch (NullPointerException e) {
            System.out.println("String is Null");
        } catch (Exception e) {
            System.out.println("All Type Exception Handled");
        }
        System.out.println("Executed Successfully");
    }
}
