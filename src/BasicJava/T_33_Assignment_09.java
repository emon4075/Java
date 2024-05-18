package BasicJava;

import java.util.Scanner;

public class T_33_Assignment_09 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Your Language: ");
        String Option = Input.nextLine();
        switch (Option) {
            case "Bengali":
                System.out.println("Tui Hala Bangal");
                break;
            case "Hindi":
                System.out.println("Tui Hala Indian");
                break;
            case "English":
                System.out.println("Tui Hala English MotherBoard");
                break;
            default:
                System.out.println("Boba Sala");
                break;
        }
    }
}
