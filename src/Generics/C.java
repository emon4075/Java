package Generics;

public class C {
    public static void main(String[] args) {
        Prac<String> P1 = new Prac<>("Hello");
        System.out.println(P1.printName());
        Prac<Integer> P2 = new Prac<>(12);
        System.out.println(P2.printName());
    }
}
