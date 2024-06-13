package BasicJava;

import java.util.Scanner;

public class T_26_Vowel_Consonant {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner charInput = new Scanner(System.in);
        char C;
        System.out.print("Enter a Character: ");
        C = charInput.next().charAt(0);
        if (C == 'A' || C == 'E' || C == 'I' || C == 'O' || C == 'U') {
            System.out.println("It is a Vowel");
        } else {
            System.out.println("It is a Consonant");
        }
    }
}
