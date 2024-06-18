package OOPS;

import java.io.FileWriter;
import java.util.Scanner;

public class File_Write {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        try {
            FileWriter F = new FileWriter("E:\\Java\\File\\WriteFile.txt");
            Scanner S = new Scanner(System.in);
            System.out.print("Enter Your Name: ");
            String Name = S.nextLine();
            try {
                F.write(Name);
            } finally {
                F.close();
            }
            System.out.println("Data Wrote Successfully");
        } catch (Exception e) {
            System.out.println("Exception Handled");
        }
    }
}
