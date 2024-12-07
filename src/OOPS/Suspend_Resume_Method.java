package OOPS;

class SR extends Thread {
    public void run() {
        String S = Thread.currentThread().getName();
        for (int i = 0; i < 5; i++) {
            System.out.println(S);
        }
    }
}

public class Suspend_Resume_Method {
    @SuppressWarnings("removal")
    public static void main(String[] args) {
        try {
            SR S1 = new SR();
            SR S2 = new SR();
            SR S3 = new SR();
            S1.setName("Thread 1");
            S2.setName("Thread 2");
            S3.setName("Thread 3");
            S1.start();
            S2.start();
            S2.suspend();
            S3.start();
            S2.resume();
        } catch (UnsupportedOperationException e) {
            System.out.println("Exception Handled");
        }
    }
}
