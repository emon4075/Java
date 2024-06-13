package BasicJava;

import java.util.Scanner;

public class T_72_Max_Min_Array {
    @SuppressWarnings("resource")

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int Number = Input.nextInt();
        int[] Array = new int[Number];
        int Max = -1, Min = 1000;
        System.out.println("Enter The Array Elements: ");
        for (int i = 0; i < Array.length; i++) {
            Array[i] = Input.nextInt();
            if (Array[i] > Max) {
                Max = Array[i];
            } else if (Array[i] < Min) {
                Min = Array[i];
            }
        }
        System.out.println("Maximum Value is: " + Max);
        System.out.println("Minimum Value is: " + Min);
    }
}
