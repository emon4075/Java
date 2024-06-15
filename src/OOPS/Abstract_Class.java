package OOPS;

abstract class Animal {
    public abstract void Eat();
}

class Tiger extends Animal {
    @Override
    public void Eat() {
        System.out.println("Tiger is Eating");
    }

    void M1() {
        System.out.println("Meow");
    }
}

class Liger extends Animal {
    @Override
    public void Eat() {
        System.out.println("Liger is Eating");
    }

    void M2() {
        System.out.println("Beow");

    }
}

public class Abstract_Class {
    public static void main(String[] args) {
        Animal Obj1 = new Tiger();
        Obj1.Eat();
        Animal Obj2 = new Liger();
        Obj2.Eat();
        Liger Obj3 = new Liger();
        Obj3.M2();
    }
}
