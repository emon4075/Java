package ProblemSolving;

/**
 * I_Palindrome
 */
import java.util.Scanner;

public class I_Palindrome {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int Sum = 0, CPY, Number = Input.nextInt();
        CPY = Number;
        while (Number > 0) {
            int Rem = Number % 10;
            Number /= 10;
            Sum = (Sum * 10) + Rem;
        }
        if (Sum == CPY) {
            System.out.println(CPY);
            System.out.println("YES");
        } else {
            System.out.println(Sum);
            System.out.println("NO");
        }
    }
}