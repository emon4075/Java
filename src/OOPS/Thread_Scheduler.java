package OOPS;

class TS extends Thread {
    public void run() {
        String S = Thread.currentThread().getName();
        for (int i = 1; i <= 3; i++) {
            System.out.println(S);
        }
    }
}

public class Thread_Scheduler {
    public static void main(String[] args) {
        TS T1 = new TS();
        TS T2 = new TS();
        TS T3 = new TS();
        T1.setName("Thread 1");
        T2.setName("Thread 2");
        T3.setName("Thread 3");
        T1.start();
        T2.start();
        T3.start();
        String S = Thread.currentThread().getName();
        for (int i = 1; i <= 3; i++) {
            System.out.println(S);
        }
    }
}
