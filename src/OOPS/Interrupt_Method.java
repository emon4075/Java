package OOPS;

class IM extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 1");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
    }
}

public class Interrupt_Method {
    public static void main(String[] args) {
        IM O1 = new IM();
        O1.start();
        O1.interrupt();
    }
}
