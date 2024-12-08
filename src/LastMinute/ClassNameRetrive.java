package LastMinute;

import java.util.*;

public class ClassNameRetrive {
    public static void main(String[] args) {
        ClassNameRetrive Obj = new ClassNameRetrive();

        System.out.println("Class: " + Obj.getClass());
        System.out.println("Class Name: " + Obj.getClass().getName());
        System.out.println("Simple Class Name: " + Obj.getClass().getSimpleName());
        System.out.println("Type Name: " + Obj.getClass().getTypeName());
        System.out.println("Canonical Name: " + Obj.getClass().getCanonicalName());

        assert Obj.getClass().getSimpleName().equals("ClassNameRetrive") : "Assertion failed: Class name mismatch!";

        List<Integer> L1 = new ArrayList<>();
        System.out.println("Class: " + L1.getClass());
        System.out.println("Class Name: " + L1.getClass().getName());
        System.out.println("Simple Class Name: " + L1.getClass().getSimpleName());
        System.out.println("Type Name: " + L1.getClass().getTypeName());
        System.out.println("Canonical Name: " + L1.getClass().getCanonicalName());
    }
}
