package OOPS;

class Super {
    void FirstName() {
        System.out.print("Abdullah ");
    }
}

class Next1 extends Super {
    void LastName1() {
        System.out.print("Emon\n");
    }
}

class Next2 extends Super {
    void LastName2() {
        System.out.print("Al Mamun Emon\n");
    }
}

public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        Next1 OBJ1 = new Next1();
        OBJ1.FirstName();
        OBJ1.LastName1();
        Next2 OBJ2 = new Next2();
        OBJ2.FirstName();
        OBJ2.LastName2();
    }
}
