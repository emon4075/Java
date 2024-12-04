package CollectionFramework;

import java.util.List;

public class Iterator {
    public static void main(String[] args) {
        List<String> L = new java.util.ArrayList<>();
        L.add("Emon");
        L.add("Emona");
        L.add("Emonaa");
        L.add("Emonaaa");
        java.util.Iterator<String> IT = L.iterator();
        while (IT.hasNext()) {
            System.out.println(IT.next());
        }
    }
}
