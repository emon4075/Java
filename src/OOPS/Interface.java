package OOPS;

import java.util.Scanner;

interface Client {
    void Input();

    void Output();
}

class Dev implements Client {
    String Name;
    int Age;

    @SuppressWarnings("resource")
    public void Input() {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter User Name: ");
        Name = S.nextLine();
        System.out.print("Enter User Age: ");
        Age = S.nextInt();
    }

    public void Output() {
        System.out.println("User Name: " + Name);
        System.out.println("User Age: " + Age);
    }
}

public class Interface {
    public static void main(String[] args) {
        Dev Obj = new Dev();
        Obj.Input();
        Obj.Output();
    }
}
