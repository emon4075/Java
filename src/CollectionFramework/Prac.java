package CollectionFramework;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Prac {
    public static void main(String[] args) {
        List<Integer> L = new ArrayList<>();
        L.add(1);
        L.add(2);
        L.add(3);
        L.add(4);
        L.remove(1);
        // L.clear();
        L.set(1, 20);
        System.out.println(L.contains(20));
        System.out.println(L.isEmpty());
        // for (Integer integer : L) {
        // System.out.println(integer);
        // }
        Iterator<Integer> I = L.iterator();
        while (I.hasNext()) {
            System.out.println(I.next());
        }
    }
}
