package OOPS;

import java.io.*;

public class File_Append {
    public static void main(String[] args) {
        try {
            FileWriter F = new FileWriter("E:\\Java\\File\\WriteFile.txt", true);
            F.append("\nAppended Text");
            F.close();
            System.out.println("Appeded Successfully");
        } catch (Exception e) {
            System.out.println("Exception Handled: " + e.getMessage());
        }
    }
}
