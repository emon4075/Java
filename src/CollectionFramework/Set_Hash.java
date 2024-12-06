package CollectionFramework;

import java.util.*;

public class Set_Hash {
    public static void main(String[] args) {
        Set<String> S = new HashSet<>();
        S.add("Emon");
        S.add("Saad");
        S.add("Emran");
        S.add("Anik");
        System.out.println(S);
        System.out.println(S.contains("Hasib"));
        System.out.println(S.isEmpty());
        S.remove("Anik");
        System.out.println(S);
        for (String ST : S) {
            System.out.println(ST);
        }
    }
}
