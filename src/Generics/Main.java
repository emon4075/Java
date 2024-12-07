package Generics;

public class Main {
    public static void main(String[] args) {
        /*
         * Pure Generics
         */
        Generic_Class<Integer> G1 = new Generic_Class<>(12);
        Generic_Class<String> G2 = new Generic_Class<>("S");
        Generic_Class<Double> G3 = new Generic_Class<>(12.98);
        System.out.println(G1.getValue());
        System.out.println(G2.getValue());
        System.out.println(G3.getValue());

        /*
         * Bounded Generics
         */

        Bounded_Generics<Integer> G4 = new Bounded_Generics<>(3);
        Bounded_Generics<Double> G5 = new Bounded_Generics<>(3.87);
        System.out.println(G4.getValue());
        System.out.println(G5.getValue());
    }
}
