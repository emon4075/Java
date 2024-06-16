package OOPS;

public class Exception_Intro {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        int A = 10, B = 0;
        try {
            int C = A / B;
            System.out.println("Not Found");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Found");
        }
    }
}
