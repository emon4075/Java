package OOPS;

class Name extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("From Thread Name");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Exception Handled");
        }
    }
}

public class Multithreading_Thread_Class {
    public static void main(String[] args) throws InterruptedException {
        Name Obj = new Name();
        Obj.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("From Thread Main");
            Thread.sleep(1000);
        }
    }
}