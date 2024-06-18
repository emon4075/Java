/*
 * Read The File Data To A String 
 * Convert The String To Word
 */
package OOPS;

import java.io.FileReader;
import java.io.IOException;

public class File_Operation {
    public static void main(String[] args) throws IOException {
        FileReader F = new FileReader("E:\\Java\\File\\Copy.txt");
        String Main = "";
        int I;
        while ((I = F.read()) != -1) {
            Main += (char) I;
        }
        F.close();
        String[] Words = Main.split(" ");
        for (String string : Words) {
            System.out.println(string);
        }
    }
}
