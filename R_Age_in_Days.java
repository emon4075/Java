import java.time.Year;
import java.util.Scanner;
package ProblemSolving;

/**
 * R_Age_in_Days
 */
public class R_Age_in_Days {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int N = SC.nextInt();
        int Years = N / 365;
        N %= 365;
        int Months = N / 30;
        N %= 30;
        System.out.println(Years + " years");
        System.out.println(Months + " months");
        System.out.println(N + " days");
    }
}