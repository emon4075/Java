package BasicJava;

import java.util.Scanner;

public class T_39_Do_While_Loop {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter The Range: ");
        int i = 0, Range = Input.nextInt();
        do {
            System.out.println("Hello World-" + i);
            ++i;
        } while (i < Range);
    }
}
