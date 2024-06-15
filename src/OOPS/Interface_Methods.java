package OOPS;

interface webClient {
    void UI_UX();

    void Develope();
}

abstract class emonLLC implements webClient {
    @Override
    public void UI_UX() {
        System.out.println("UI Buit Successfully");
    }
}

class saadLLC extends emonLLC {
    @Override
    public void Develope() {
        System.out.println("App Developed Successfully");
    }
}

public class Interface_Methods {
    public static void main(String[] args) {
        saadLLC Obj = new saadLLC();
        Obj.UI_UX();
        Obj.Develope();
    }
}
