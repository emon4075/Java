package OOPS;

class Annot {
    void Display() {
        System.out.println("From The Superclass");
    }
}

class newAnnot extends Annot {
    @Override
    void Display() {
        System.out.println("From The Subclass");
    }
}

public class Override_Annotation {
    public static void main(String[] args) {
        newAnnot Obj = new newAnnot();
        Obj.Display();
    }
}
