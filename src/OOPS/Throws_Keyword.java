package OOPS;

/*
 * Another Approach is Try-Catch Block
 */
public class Throws_Keyword {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println("I Love You -> " + i);
            Thread.sleep(1000);
        }
    }
}
