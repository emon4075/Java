package OOPS;

class STP1 extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread 1");
        }
    }
}

class STP2 extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread 2");
        }
    }
}

public class Stop_Method {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        STP1 O1 = new STP1();
        STP2 O2 = new STP2();
        O1.start();
        O2.start();
        O1.stop();
    }
}
