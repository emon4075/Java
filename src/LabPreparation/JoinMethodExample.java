package LabPreparation;

class threadMaker extends Thread {
    public void run() {
        String S = Thread.currentThread().getName();
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(S);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

public class JoinMethodExample {
    public static void main(String[] args) {
        threadMaker T1 = new threadMaker();
        threadMaker T2 = new threadMaker();

        T1.setName("A");
        T2.setName("B");

        T1.start();
        T2.start();

        try {
            T1.join();
            T2.join();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(T1.getPriority());
        System.out.println(T2.getPriority());
    }
}