package Generics;

interface Num<T> {
    public T giveValue(T Val);
}

public class Generic_Interface<T> implements Num<T> {
    public T giveValue(T Val) {
        return Val;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[] args) {
        Generic_Interface G1 = new Generic_Interface<>();
        System.out.println(G1.giveValue(12));
        Generic_Interface G2 = new Generic_Interface<>();
        System.out.println(G2.giveValue("Emon"));
    }
}
