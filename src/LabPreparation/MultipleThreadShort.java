package LabPreparation;

class CustomThread extends Thread {
    @SuppressWarnings("deprecation")
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " Started");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i + " -> " + threadName);
                Thread.sleep(1000);
                if (threadName == "A" && i == 1) {
                    stop();
                }
                if (threadName == "C" && i == 1) {
                    Thread.sleep(5000);
                }
            }
            System.out.println(threadName + " Ended");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class MultipleThreadShort {
    public static void main(String[] args) throws Exception {
        CustomThread threadA = new CustomThread();
        CustomThread threadB = new CustomThread();
        CustomThread threadC = new CustomThread();

        threadA.setName("A");
        threadB.setName("B");
        threadC.setName("C");

        threadA.start();
        threadB.start();
        threadC.start();

        threadA.join();
        threadB.join();
        threadC.join();

        System.out.println(threadA.isAlive());

    }
}
