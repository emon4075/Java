package OOPS;

class IA extends Thread {
    public void run() {
        System.out.println("Hello World");
    }
}

public class isAlive_Method {
    public static void main(String[] args) {
        IA O1 = new IA();
        IA O2 = new IA();
        System.out.println("Before Start: " + O1.isAlive());
        O1.start();
        O2.start();
        System.out.println("After Start: " + O1.isAlive());

    }
}
