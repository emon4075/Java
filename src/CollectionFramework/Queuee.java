package CollectionFramework;

import java.util.*;

public class Queuee {
    public static void main(String[] args) {
        Queue<Integer> Q = new LinkedList<>();
        Q.add(1);
        Q.add(2);
        Q.add(3);
        Q.add(4);
        Q.add(5);
        System.out.println(Q);
        System.out.println(Q.size());
        System.out.println(Q.peek());
        Q.poll();
        System.out.println(Q);
    }
}
