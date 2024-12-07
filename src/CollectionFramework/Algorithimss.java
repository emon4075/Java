package CollectionFramework;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class Algorithimss {
    public static void main(String[] args) {
        List<Integer> L = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int N = (int) (Math.random() * 10);
            L.add(N);
        }
        System.out.println(L);
        Collections.sort(L);
        System.out.println(L);
        Collections.reverse(L);
        System.out.println(L);
        System.out.println(Collections.max(L));
        System.out.println(Collections.min(L));
    }
}