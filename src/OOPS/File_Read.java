package OOPS;

import java.io.FileReader;
import java.io.IOException;

public class File_Read {
    public static void main(String[] args) throws IOException {
        FileReader F = new FileReader("E:\\Java\\File\\WriteFile.txt");
        int C;
        while ((C = F.read()) != -1) {
            System.out.print((char) C);
        }
        F.close();
    }
}
