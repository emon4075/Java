package OOPS;

class Overload {
    int Age;
    String Name;
    double Money;

    Overload() {
        System.out.println("Default Constructor");
    }

    Overload(int I) {
        System.out.println("Constructor With One Perameter");
    }

    Overload(int Age, String Name) {
        System.out.println("Constructor With Two Perameter");
    }
}

public class Constructor_Overloading {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Overload A = new Overload();
        Overload B = new Overload(10);
        Overload C = new Overload(10, "Emon");
    }
}
