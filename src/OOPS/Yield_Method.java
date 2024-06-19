package OOPS;

class Y1 extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread 1");
            Thread.yield();
        }
    }
}

class Y2 extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread 2");
        }
    }
}

public class Yield_Method {
    public static void main(String[] args) {
        Y1 O1 = new Y1();
        Y2 O2 = new Y2();
        O1.start();
        O2.start();
    }
}
