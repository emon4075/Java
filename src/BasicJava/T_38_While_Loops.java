package BasicJava;

import java.util.Scanner;

public class T_38_While_Loops {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter The Range: ");
        int i = 0, Range = Input.nextInt();
        while (i < Range) {
            System.out.println("Hello World-" + i);
            i++;
        }
    }
}
