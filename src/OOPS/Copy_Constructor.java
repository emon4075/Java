package OOPS;

class Uni {
    String Name;

    Uni(String Name) {
        this.Name = Name;
    }

    Uni(Uni ref) {
        Name = ref.Name;
    }
}

public class Copy_Constructor {
    public static void main(String[] args) {
        Uni A = new Uni("University of Chittagong");
        System.out.println("Real Constructor: " + A.Name);
        Uni B = new Uni(A);
        System.out.println("Copied Constructor: " + B.Name);
    }
}