package ProblemSolving;
import java.util.Scanner;

/**
 * J_Lucky_Array
 */
public class J_Lucky_Array {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int N = Input.nextInt();
        int[] Array = new int[N];
        int Min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            Array[i] = Input.nextInt();
            if (Array[i] < Min) {
                Min = Array[i];
            }
        }
        int Counter = 0;
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] == Min) {
                Counter++;
            }
        }
        if (Counter%2==1) {
            System.out.println("Lucky");
        }
        else{
            System.out.println("Unlucky");
        }
    }
}