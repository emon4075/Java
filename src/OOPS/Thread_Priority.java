/*
 * Default Priority is 5
 */
package OOPS;

class P extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
}

public class Thread_Priority {
    public static void main(String[] args) {
        P P1 = new P();
        P P2 = new P();
        P P3 = new P();
        P1.setName("Thread 1");
        P2.setName("Thread 2");
        P3.setName("Thread 3");
        P1.setPriority(10);
        P2.setPriority(8);
        P3.setPriority(2);
        P1.start();
        P2.start();
        P3.start();
    }
}
