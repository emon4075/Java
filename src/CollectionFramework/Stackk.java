package CollectionFramework;

import java.util.*;

public class Stackk {
    public static void main(String[] args) {
        Stack<Integer> S = new Stack<>();
        S.push(1);
        S.push(2);
        S.push(3);
        S.push(4);
        S.push(5);
        System.out.println(S);
        S.pop();
        System.out.println(S);
        System.out.println(S.peek());
        System.out.println(S.size());
        System.out.println(S.contains(10));
    }
}
