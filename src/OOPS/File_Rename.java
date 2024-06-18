package OOPS;

import java.io.File;
import java.io.IOException;

public class File_Rename {
    public static void main(String[] args) throws IOException {
        File F = new File("E:\\Java\\File\\OldName.txt");
        F.createNewFile();
        File G = new File("E:\\Java\\File\\NewName.txt");
        if (F.exists()) {
            System.out.println(F.renameTo(G));
        } else {
            System.out.println("File Not Found");
        }
    }
}
