package LabPreparation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class File {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader F = new FileReader("src\\LabPreparation\\Hello.txt");
        Scanner S = new Scanner(F);
        String Str = "";
        while (S.hasNextLine()) {
            Str += S.nextLine();
        }
        String[] Array = Str.split(" ");
        Map<String, Integer> M = new HashMap<>();
        for (String string : Array) {
            if (M.containsKey(string)) {
                M.put(string, M.get(string) + 1);
            } else {
                M.put(string, 0);
            }
        }
        for (String string : M.keySet()) {
            System.out.println(string + " -> " + M.get(string));
        }
        S.close();
    }
}
