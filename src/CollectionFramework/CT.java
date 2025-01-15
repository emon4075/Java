package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CT {
    public static void main(String[] args) throws UnsupportedOperationException {
        Integer[] A = { 1, 3, 5, 2, 4, 5, 6, 7, 8 };
        int Index = Arrays.binarySearch(A, 3);
        System.out.println(Index);
        List<Integer> L = new ArrayList<>(Arrays.asList(A));
        L.add(10);
        System.out.println(L);
        Collections.sort(L, Comparator.reverseOrder());
        System.out.println(L);
        System.out.println(Collections.frequency(L, 5));
        Collections.shuffle(L);
        System.out.println(L);
    }
}