package CollectionFramework;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<Integer> L1 = new java.util.ArrayList<>();
        L1.add(10);
        L1.add(11);
        L1.add(12);
        System.out.println(L1);
        L1.add(13);
        System.out.println(L1);
        List<Integer> L2 = new java.util.ArrayList<>();
        L2.add(20);
        L2.add(21);
        L2.add(22);
        L2.add(23);
        L1.addAll(L2);
        System.out.println(L1);

        System.out.println("First Element: " + L1.get(0));
        System.out.println("Third Element: " + L1.get(2));
        L1.remove(0);
        System.out.println(L1);
        L1.remove(Integer.valueOf(20));
        System.out.println(L1);
        L1.set(0, 1000);
        System.out.println(L1);

        for (int i = 0; i < L1.size(); i++) {
            System.out.println(L1.get(i));
        }

        java.util.Iterator<Integer> IT = L1.iterator();
        while (IT.hasNext()) {
            System.out.println(IT.next());
        }
    }
}
