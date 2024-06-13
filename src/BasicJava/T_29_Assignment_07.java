package BasicJava;

import java.util.Scanner;

public class T_29_Assignment_07 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.println("Do You Love Java: ");
        Scanner charInput = new Scanner(System.in);
        System.out.println("Enter Your Choice Y/N: ");
        char Ch = charInput.next().charAt(0);
        if (Ch == 'Y' || Ch == 'y') {
            System.out.println("Java Lover");
        } else {
            System.out.println("Java Hater");
        }
    }
}
