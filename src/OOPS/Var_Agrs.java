package OOPS;

class addsMultipleNumbers {
    int Sum = 0;

    void Numbers(int... A) {
        for (int i : A) {
            Sum += i;
        }
    }
}

public class Var_Agrs {
    public static void main(String[] args) {
        addsMultipleNumbers Obj = new addsMultipleNumbers();
        Obj.Numbers(10, 20, 30);
        System.out.println("Sum is: " + Obj.Sum);
    }
}
