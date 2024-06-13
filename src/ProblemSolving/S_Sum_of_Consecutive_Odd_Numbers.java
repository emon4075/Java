package ProblemSolving;
import java.util.Scanner;

/**
 * S_Sum_of_Consecutive_Odd_Numbers
 */
public class S_Sum_of_Consecutive_Odd_Numbers {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner Input = new Scanner(System.in);
        int T = Input.nextInt();
        while (T-- != 0) {
            int X = Input.nextInt();
            int Y = Input.nextInt();
            int Sum = 0;
            if (X > Y) {
                for (int i = Y + 1; i < X; i++) {
                    if (i % 2 == 1) {
                        Sum += i;
                    }
                }
            } else {
                for (int i = X + 1; i < Y; i++) {
                    if (i % 2 == 1) {
                        Sum += i;
                    }
                }
            }
            System.out.println(Sum);
        }
    }
}