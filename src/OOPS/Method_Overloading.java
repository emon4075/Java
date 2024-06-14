package OOPS;

class Over_load {
    void Name() {
        System.out.println("No Parameter");
    }

    void Name(int A) {
        System.out.println("Single Parameter");
    }

    void Name(int A, int B) {
        System.out.println("Double Parameter");
    }
}

public class Method_Overloading {
    public static void main(String[] args) {
        Over_load Obj = new Over_load();
        Obj.Name();
        Obj.Name(5);
        Obj.Name(5, 10);
    }
}
