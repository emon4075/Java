package OOPS;

import java.io.File;

public class File_Info {
    public static void main(String[] args) {
        File F = new File("E:\\Java\\File\\Hello.txt");
        if (F.exists()) {
            System.out.println("File Name: " + F.getName());
            System.out.println("File Location: " + F.getAbsolutePath());
            System.out.println("File Writeable: " + F.canWrite());
            System.out.println("File Readable: " + F.canRead());
            System.out.println("File Size: " + F.length());
            // System.out.println("File Removed: " + F.delete());
        } else {
            System.out.println("Not Exists");
        }
    }
}
