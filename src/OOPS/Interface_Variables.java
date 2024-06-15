package OOPS;

interface customerEmon {
    int Rice = 5;

    void Amount();
}

class devEmon implements customerEmon {
    @Override
    public void Amount() {
        System.out.println("Rice is: " + Rice + " Kg");
    }
}

public class Interface_Variables {
    public static void main(String[] args) {
        /*
         * Here Rice is a Static varibale that's why it can be accessed without object
         * creation
         */
        System.out.println(customerEmon.Rice);
        devEmon Obj = new devEmon();
        Obj.Amount();
    }
}
