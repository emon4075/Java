package OOPS;

import java.io.*; // Includes All The Classe Under IO Pacakge

public class Create_File {
    public static void main(String[] args) throws IOException { // We Can Use Try-Catch Instead
        File F = new File("E:\\Java\\File\\Hello.txt");
        if (F.createNewFile()) {
            System.out.println("File Created");
        } else {
            System.out.println("File Exists");
        }
    }
}
