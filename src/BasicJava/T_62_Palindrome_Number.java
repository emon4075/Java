package BasicJava;

import java.util.Scanner;

public class T_62_Palindrome_Number {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int Sum = 0, CPY, Number = Input.nextInt();
        CPY = Number;
        while (Number > 0) {
            int Rem = Number % 10;
            Number /= 10;
            Sum = (Sum * 10) + Rem;
        }
        if (Sum == CPY) {
            System.out.printf("%d is a Palindrome Number", CPY);
        } else {
            System.out.printf("%d is Not A Palindrome Number", CPY);
        }
    }
}
