package BasicJava;

import java.util.Scanner;

public class T_15_Arithmetic_Operator {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int A = Input.nextInt();
        System.out.print("Enter Another Integer: ");
        int B = Input.nextInt();
        int Sum = A + B;
        System.out.println("Addition is: " + Sum);
        int Reminder = A % B;
        System.out.println("Reminder is: " + Reminder);
        double Division = (float) A / B;
        System.out.println("Division is: " + Division);
    }
}
