package BasicJava;

import java.util.Scanner;

public class T_14_Assignment_03 {
    public static void main(String[] args) {
        int ID, Price;
        String Title, Description, Category;
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter ID: ");
        ID = Input.nextInt();
        System.out.print("Enter The Price: ");
        Price = Input.nextInt();
        Input.nextLine();
        System.out.print("Enter The Title: ");
        Title = Input.next();
        Input.nextLine();
        System.out.print("Enter The Description: ");
        Description = Input.nextLine();
        System.out.print("Enter The Category: ");
        Category = Input.nextLine();
        System.out.println("ID: " + ID);
        System.out.println("Price: " + Price);
        System.out.println("Title: " + Title);
        System.out.println("Description: " + Description);
        System.out.println("Category: " + Category);
        Input.close();
    }
}
