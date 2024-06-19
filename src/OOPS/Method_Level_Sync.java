package OOPS;

class PrintTable {
    public synchronized void PT(int N) {
        for (int i = 1; i < 11; i++) {
            System.out.println(N * i);
        }
    }
}

class MLT1 extends Thread {
    PrintTable table;

    MLT1(PrintTable table) {
        this.table = table;
    }

    public void run() {
        table.PT(4);
    }
}

class MLT2 extends Thread {
    PrintTable table;

    MLT2(PrintTable table) {
        this.table = table;
    }

    public void run() {
        table.PT(5);
    }
}

public class Method_Level_Sync {
    public static void main(String[] args) {
        PrintTable table = new PrintTable();
        MLT1 thread1 = new MLT1(table);
        MLT2 thread2 = new MLT2(table);
        thread1.start();
        thread2.start();
    }
}
