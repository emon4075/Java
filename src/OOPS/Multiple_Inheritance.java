package OOPS;

interface First {
    void Show();
}

interface Second {
    void Display();
}

class emonDev implements First, Second {
    public void Show() {
        System.out.println("This is First Interface");
    }

    public void Display() {
        System.out.println("This is Second Interface");
    }
}

public class Multiple_Inheritance {
    public static void main(String[] args) {
        emonDev Obj = new emonDev();
        Obj.Show();
        Obj.Display();
    }
}
