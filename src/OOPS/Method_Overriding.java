package OOPS;

class Cyclone {
    void Rain() {
        System.out.println("It is Raining");
    }
}

class Fire extends Cyclone {
    @Override
    void Rain() {
        System.out.println("We Need Rain Water");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        Cyclone Obj = new Fire();
        Obj.Rain();
    }
}
