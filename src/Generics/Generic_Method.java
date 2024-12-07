package Generics;

public class Generic_Method {

    public <T> void get_Element(T A[]) {
        for (T i : A) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Integer A[] = { 1, 2, 3, 4, 6 };
        String S[] = { "Emon", "Saad", "Anik" };
        Character C[] = { 'A', 'B', 'C' };
        Generic_Method Gm = new Generic_Method();
        Gm.get_Element(A);
        Gm.get_Element(S);
        Gm.get_Element(C);
    }
}