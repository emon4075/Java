package OOPS;

class Add2Numbers {
    int Result;

    void Add(int A, int B) {
        Result = A + B;
    }
}

class Display extends Add2Numbers {
    void Disp() {
        System.out.print("The Sum is: ");
    }
}

public class Simple_Inheritance {
    public static void main(String[] args) {
        Display OBJ = new Display();
        OBJ.Disp();
        OBJ.Add(10, 15);
        System.out.println(OBJ.Result);
    }
}
