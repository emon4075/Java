/*
 * This Program Reads From a File
 */
package OOPS;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Built_In_Package {
    public static void main(String[] args) throws IOException {
        File F = new File("E:\\Java\\File\\Copy.txt");
        Scanner S = new Scanner(F);
        while (S.hasNextLine()) {
            System.out.println(S.nextLine());
        }
        S.close();
    }
}
