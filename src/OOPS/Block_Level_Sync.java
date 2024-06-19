package OOPS;

class MSG {
    public void Show(String M) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello " + M);
        }
    }
}

class BL1 extends Thread {
    MSG M;

    BL1(MSG M) {
        this.M = M;
    }

    public void run() {
        synchronized (M) {
            M.Show(getName());
        }
    }
}

class BL2 extends Thread {
    MSG M;

    BL2(MSG M) {
        this.M = M;
    }

    public void run() {
        synchronized (M) {
            M.Show(getName());
        }
    }
}

public class Block_Level_Sync {
    public static void main(String[] args) {
        MSG O1 = new MSG();
        BL1 T1 = new BL1(O1);
        BL2 T2 = new BL2(O1);
        T1.setName("Emon");
        T2.setName("Remon");
        T1.start();
        T2.start();
    }
}
