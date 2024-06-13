package ProblemSolving;

import java.util.Scanner;

/**
 * F_Multiplication_table
 */
public class F_Multiplication_table {
    @SuppressWarnings("resource")

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int N = Input.nextInt();
        for (int i = 1; i <= 12; i++) {
            int Res = N * i;
            System.out.println(N + " * " + i + " = " + Res);
        }
    }
}