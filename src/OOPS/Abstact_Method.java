package OOPS;

abstract class Programming {
    public abstract void Developer();
}

class C extends Programming {
    @Override
    public void Developer() {
        System.out.println("Dennis Rithche");
    }
}

class Java extends Programming {
    @Override
    public void Developer() {
        System.out.println("James Gosling");
    }
}

public class Abstact_Method {
    public static void main(String[] args) {
        C Obj1 = new C();
        Obj1.Developer();
        Java Obj2 = new Java();
        Obj2.Developer();
        /* Same Same */
        Programming Obj3 = new C();
        Obj3.Developer();
        Programming Obj4 = new Java();
        Obj4.Developer();
    }
}
