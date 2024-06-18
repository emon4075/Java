package OOPS;

import java.io.*;

public class File_Copy {
    public static void main(String[] args) throws IOException {
        FileReader F = new FileReader("E:\\Java\\File\\Main.txt");
        FileWriter G = new FileWriter("E:\\Java\\File\\Copy.txt");
        int I;
        while ((I = F.read()) != -1) {
            G.write((char) I);
        }
        G.close();
        F.close();
        System.out.println("Data Copied Successfully");
    }
}
