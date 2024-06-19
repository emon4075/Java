package OOPS;

class Numbers implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Numbers Thread -> " + i);
        }
    }
}

public class Multithreading_Runnable_Interface {
    public static void main(String[] args) {
        Numbers R = new Numbers();
        Thread Obj = new Thread(R);
        Obj.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread -> " + i);
        }
    }
}
