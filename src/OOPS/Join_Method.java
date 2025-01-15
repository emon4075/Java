/*
 * If we start J3 and declare J3.join() then J3 will 
 * completely execute before executing another one
 */
package OOPS;

class Join extends Thread {
    public void run() {
        String S = Thread.currentThread().getName();
        for (int i = 0; i <= 5; i++) {
            System.out.println(S);
        }
    }
}

public class Join_Method {
    public static void main(String[] args) throws InterruptedException {
        Join J1 = new Join();
        Join J2 = new Join();
        Join J3 = new Join();
        J1.setName("Thread 1");
        J2.setName("Thread 2");
        J3.setName("Thread 3");

        J2.start();
        J3.start();
        J1.start();

        J3.join();
    }
}
