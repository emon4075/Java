package OOPS;

import java.util.Scanner;

class Sum_Sub {
    void Add(int A, int B) {
        System.out.println("Sum is: " + (A + B));
    }

    void Sub(int A, int B) {
        System.out.println("Subtraction is: " + (A - B));
    }
}

class Multi_Div extends Sum_Sub {
    void Multiply(int A, int B) {
        System.out.println("Multiplication is: " + (A * B));
    }

    void Divide(int A, int B) {
        System.out.println("Division is: " + (A / (double) B));
    }
}

class Reminder extends Multi_Div {
    void Remains(int A, int B) {
        System.out.println("Reminder is: " + (A % B));
    }
}

public class Multilevel_Inheritance {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter The First Number: ");
        int N1 = S.nextInt();
        System.out.print("Enter The Second Number: ");
        int N2 = S.nextInt();
        Reminder OBJ = new Reminder();
        OBJ.Add(N1, N2);
        OBJ.Sub(N1, N2);
        OBJ.Multiply(N1, N2);
        OBJ.Divide(N1, N2);
        OBJ.Remains(N1, N2);
    }
}
