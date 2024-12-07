package Generics;

public class Bounded_Generics<T extends Number> {
    T I;

    Bounded_Generics(T I) {
        this.I = I;
    }

    public T getValue() {
        return I;
    }
}