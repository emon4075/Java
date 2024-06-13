package OOPS;

class Info {
    String Name;
    int Age;
    double Money;

    Info(String Name, int Age, double Money) {
        this.Name = Name;
        this.Age = Age;
        this.Money = Money;
    }

    void PrintDetails() {
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Money: " + Money);
    }
}

public class Java_Constructor {
    public static void main(String[] args) {
        Info Emon = new Info("Emon", 20, 420.69);
        Emon.PrintDetails();
    }
}
