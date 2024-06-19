package OOPS;

class Bus implements Runnable {
    int Available = 1, Passenger;

    Bus(int Passenger) {
        this.Passenger = Passenger;
    }

    public synchronized void run() {
        String Name = Thread.currentThread().getName();
        if (Available >= Passenger) {
            System.out.println(Name + " Got Seat");
            Available = Available - Passenger;
        } else {
            System.out.println(Name + " Got No Seat");
        }
    }
}

public class Multithreading_Solution {
    public static void main(String[] args) {
        Bus O1 = new Bus(1);
        Thread T1 = new Thread(O1);
        Thread T2 = new Thread(O1);
        Thread T3 = new Thread(O1);
        T1.setName("Thread 1");
        T2.setName("Thread 2");
        T3.setName("Thread 3");
        T1.start();
        T2.start();
        T3.start();
    }
}
