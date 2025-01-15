package Sync;

class Counter {
    int Count = 0;

    public void Increment() {
        synchronized (this) {
            Count++;
        }
    }

    public int getCount() {
        return Count;
    }
}

class customThread extends Thread {
    Counter C;

    customThread(Counter C) {
        this.C = C;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            C.Increment();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Counter C = new Counter();
        customThread T1 = new customThread(C);
        customThread T2 = new customThread(C);

        T1.start();
        T2.start();

        try {
            T1.join();
            T2.join();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(C.getCount());
    }
}
