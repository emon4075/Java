package OOPS;

public class Try_Catch_Throws {
    static void DO() throws InterruptedException {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        try {
            DO();
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println("Multiple Exception Handled");
        }
    }
}
