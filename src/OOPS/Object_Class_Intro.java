package OOPS;

class Information {
    String Name;
    int Age;
    double Money;

    void PrintDetails() {
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Money: " + Money);
    }
}

public class Object_Class_Intro {
    public static void main(String[] args) {
        Information Emon = new Information();
        Emon.Name = "Emon";
        Emon.Age = 20;
        Emon.Money = 420.69;
        Emon.PrintDetails();
    }
}
