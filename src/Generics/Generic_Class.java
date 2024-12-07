package Generics;

public class Generic_Class<T> {
    T I;

    Generic_Class(T I) {
        this.I = I;
    }

    public T getValue() {
        return I;
    }
}