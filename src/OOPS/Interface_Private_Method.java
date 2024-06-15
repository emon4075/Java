package OOPS;

interface PRVM {
    public static void Do() {
        Add(10, 20);
    }

    private static void Add(int A, int B) {
        System.out.println("Addition is: " + (A + B));
    }
}

class New implements PRVM {
    public void Sub(int A, int B) {
        System.out.println("Subtraction is: " + (A - B));
    }
}

public class Interface_Private_Method {
    public static void main(String[] args) {
        PRVM.Do();
        New Obj = new New();
        Obj.Sub(30, 20);
    }
}