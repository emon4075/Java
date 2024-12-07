package LambdaExp;

interface Num {
    int Generate();
}

public class Main {
    public static void main(String[] args) {
        Num N = () -> (int) (Math.random() * 10);
        System.out.println(N.Generate());
    }
}