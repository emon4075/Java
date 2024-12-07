/*
 * package Generics;
 * 
 * public class Prac {
 * 
 * public <T> void IT(T A[]) {
 * for (T integer : A) {
 * System.out.println(integer);
 * }
 * }
 * 
 * public static void main(String[] args) {
 * Integer INT[] = { 1, 2, 3, 4 };
 * Double DBL[] = { 1.2, 4.1, 5.2, 88.8 };
 * String STR[] = { "Emon", "Sad" };
 * Prac P1 = new Prac();
 * P1.IT(INT);
 * P1.IT(DBL);
 * P1.IT(STR);
 * }
 * }
 * 
 */

package Generics;

public class Prac<T> {
    T Name;

    Prac(T S) {
        Name = S;
    }

    T printName() {
        return Name;
    }
}