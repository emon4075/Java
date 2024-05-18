package BasicJava;

import java.util.Scanner;

public class T_59_Reverse_Number {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int Number = Input.nextInt();
        while (Number > 0) {
            int Rem = Number % 10;
            Number /= 10;
            System.out.print(Rem);
        }
    }
}
