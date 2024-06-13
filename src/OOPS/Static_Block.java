package OOPS;

public class Static_Block {
    Static_Block() {
        System.out.println("Constructor Reporting");
    }

    static {
        System.out.println("Static Block Reporting");
    }

    {
        System.out.println("Instance Block Reporting");
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        System.out.println("Main Method Reporting");
        Static_Block OBJ = new Static_Block();
    }
}
