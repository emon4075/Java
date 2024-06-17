package OOPS;

public class Exception_Propagation {
    public static void main(String[] args) {
        try {
            M1();
        } catch (Exception e) {
            System.out.println("Exception Handled At Main Method");
        }
    }

    static void M1() {
        M2();
    }

    static void M2() {
        System.out.println(10 / 0);
    }
}
