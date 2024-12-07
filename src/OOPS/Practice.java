package OOPS;

import java.io.FileWriter;
import java.io.IOException;

public class Practice {
    public static void main(String[] args) {
        try {
            FileWriter F = new FileWriter("src\\OOPS\\Hello.txt");
            System.out.println(F);  
            for (int i = 0; i < 100; i++) {
                F.write((int) (Math.random() * 100) + "\n");
            }
            F.close();
        } catch (IOException e) {
            System.out.println("Hello");
        }
    }
}