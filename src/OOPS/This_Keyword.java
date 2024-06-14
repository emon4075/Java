package OOPS;

class Add2Num {
    int A, B;

    int Meth(int A, int B) {
        this.A = A;
        this.B = B;
        int Result = A + B;
        return Result;
    }
}

public class This_Keyword {
    public static void main(String[] args) {
        Add2Num OBJ = new Add2Num();
        System.out.println("The Sum is: " + OBJ.Meth(20, 20));
    }
}
