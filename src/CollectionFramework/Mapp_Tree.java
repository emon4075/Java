package CollectionFramework;

import java.util.*;

public class Mapp_Tree {
    public static void main(String[] args) {
        Map<String, Integer> M = new TreeMap<>();
        M.put("Emon", 28);
        M.put("Saad", 45);
        M.put("Hasib", 24);
        M.put("Emran", 69);
        System.out.println(M.get("Emon"));
        System.out.println(M.containsKey("Emon"));
        System.out.println(M.isEmpty());
        System.out.println(M.size());
        System.out.println(M.keySet());
        System.out.println(M.values());

        for (String string : M.keySet()) {
            System.out.println(M.get(string) + " " + string);
        }
    }
}
