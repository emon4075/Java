package CollectionFramework;

import java.util.*;

public class Priority_Queue_MinHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> P = new PriorityQueue<>();
        P.add(2);
        P.add(1);
        P.add(5);
        P.add(3);
        P.add(6);
        System.out.println(P);
        System.out.println(P.peek());
        P.remove(1);
        System.out.println(P);
        System.out.println(P.isEmpty());
    }
}
