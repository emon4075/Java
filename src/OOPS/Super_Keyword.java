package OOPS;

class Previous {
    int Age = 20;

    void Name() {
        System.out.println("Reporting From The Super Class");
    }
}

class Now extends Previous {
    int Age = 21;

    void Name() {
        super.Name();
        System.out.println("Abdullah Emon");
        System.out.println("Previous Age: " + super.Age);
    }
}

public class Super_Keyword {
    public static void main(String[] args) {
        Now OBJ = new Now();
        System.out.println("Present Age: " + OBJ.Age);
        OBJ.Name();
    }
}
