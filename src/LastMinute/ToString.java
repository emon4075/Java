package LastMinute;

class Apple {
    String Origin;
    int Quantity;

    Apple(String S, int Quantity) {
        Origin = S;
        this.Quantity = Quantity;
    }

    public String toString() {
        return Origin + " " + Quantity;

    }
}

public class ToString {
    public static void main(String[] args) {
        Apple A1 = new Apple("Bangladesh", 10);
        Apple A2 = new Apple("England", 11);
        System.out.println(A1);
        System.out.println(A2);
    }
}
