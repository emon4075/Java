package OOPS;

interface Microsoft {
    void Add();
}

interface Google extends Microsoft {
    void Multiplication();
}

class emonDeve implements Google {
    @Override
    public void Add() {
        System.out.println("I Will Do Addition");
    }

    @Override
    public void Multiplication() {
        System.out.println("I Will Do Multiplication");
    }
}

public class Extending_Interfaces {
    public static void main(String[] args) {
        emonDeve Obj = new emonDeve();
        Obj.Add();
        Obj.Multiplication();
    }
}
