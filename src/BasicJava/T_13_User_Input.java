package BasicJava;

import java.util.Scanner;

public class T_13_User_Input {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        // This Will Take Integer as Input
        /*
         * System.out.print("Enter a Number: ");
         * int Number = Input.nextInt();
         * System.out.printf("The Integer is: %d\n", Number);
         */

        System.out.print("Enter Your Name With Space: ");
        String Name = Input.next();
        System.out.println("Name Without Space: " + Name);

        // This Will Take Name With Spaces
        /*
         * System.out.print("Enter Your Name With Space: ");
         * Name = Input.nextLine();
         * System.out.println("Name With Space: " + Name);
         */
        Input.close();
    }
}
