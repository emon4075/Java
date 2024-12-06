package CollectionFramework;

import java.util.*;

public class Set_LinkedHash {
    public static void main(String[] args) {
        Set<String> S = new LinkedHashSet<>();
        S.add("Emon");
        S.add("Saad");
        S.add("Emran");
        S.add("Anik");
        System.out.println(S);
        System.out.println(S.size());
        System.out.println(S.remove("Anik"));
        System.out.println(S);
    }
}
