package OOPS;

interface STTM {
    void A();

    static void Common() {
        System.out.println("Owner: Abdullah Al Mamun Emon");
    }
}

class DevLLC implements STTM {
    public void A() {
        System.out.println("Implemented Interface");
    }
}

public class Static_Method_Interface {
    public static void main(String[] args) {
        STTM.Common();
        DevLLC Obj = new DevLLC();
        Obj.A();
    }
}
