package OOPS;

class Sleep extends Thread {
    public void run() {
        String S = Thread.currentThread().getName();
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println(S);
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            System.out.println("Exception Handled");
        }
    }
}

public class Sleep_Method {
    public static void main(String[] args) {
        Sleep S1 = new Sleep();
        Sleep S2 = new Sleep();
        S1.setName("Thread 1");
        S2.setName("Thread 2");
        S1.start();
        S2.start();
    }
}
