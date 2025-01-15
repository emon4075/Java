package LabPreparation;

class A implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i + "-> A");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class B implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i + "-> B");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class C implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i + "-> C");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

public class Thread_Implementation {
    public static void main(String[] args) {
        Thread T1 = new Thread(new A());
        T1.start();

        Thread T2 = new Thread(new B());
        T2.start();

        Thread T3 = new Thread(new C());
        T3.start();
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i + "-> Main");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
