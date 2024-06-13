package OOPS;

public class Instance_Block {
    Instance_Block() {
        System.out.println("Constructor Reporting");
    }

    {
        System.out.println("Instance Block Reporting");
    }

    void Meth() {
        System.out.println("Method Reporting");
    }

    public static void main(String[] args) {
        Instance_Block OBJ = new Instance_Block();
        OBJ.Meth();
    }
}