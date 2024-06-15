package OOPS;

interface DFLT {
    void A();

    void B();

    default void C() {
        System.out.println("May or May Not Be Override in Sub Class");
    }
}

class aDev implements DFLT {
    public void A() {
        System.out.println("Method A --> aDev");
    }

    public void B() {
        System.out.println("Method B --> aDev");
    }

}

class bDev implements DFLT {
    public void A() {
        System.out.println("Method A --> bDev");
    }

    public void B() {
        System.out.println("Method B --> bDev");
    }

}

class cDev implements DFLT {
    public void A() {
        System.out.println("Method A --> cDev");
    }

    public void B() {
        System.out.println("Method B --> cDev");
    }

    @Override
    public void C() {
        System.out.println("Override C --> cDev");
    }

}

public class Default_Method_Interface {
    public static void main(String[] args) {
        cDev Obj1 = new cDev();
        Obj1.A();
        Obj1.B();
        Obj1.C();
        aDev Obj2 = new aDev();
        Obj2.A();
        Obj2.B();
        Obj2.C();
    }
}
