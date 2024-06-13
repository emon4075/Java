package BasicJava;

import java.util.Scanner;

public class T_37_For_Loop {
    @SuppressWarnings("resource")

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter The Range: ");
        int Range = Input.nextInt();
        for (int i = 0; i < Range; i++) {
            System.out.println("Hello World-" + i);
        }
    }
}
