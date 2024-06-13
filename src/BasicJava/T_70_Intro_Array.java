package BasicJava;

public class T_70_Intro_Array {
    public static void main(String[] args) {
        int[] Number1 = new int[3], Number2 = new int[5];
        Number1[0] = 10;
        Number1[1] = 10;
        Number1[2] = 10;
        Number2[0] = 20;
        Number2[1] = 30;
        Number2[2] = 40;
        Number2[3] = 50;
        Number2[4] = 60;
        System.out.println("Elements in The Array Number2: ");
        for (int i = 0; i < Number2.length; i++) {
            System.out.println("Number2[" + i + "] = " + Number2[i]);
        }
    }
}
