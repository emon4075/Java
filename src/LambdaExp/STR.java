package LambdaExp;

@FunctionalInterface
interface Print {
    String P(String S);
}

public class STR {

    public static void main(String[] args) {
        Print P1 = (X) -> X;
        System.out.println(P1.P("Hello World"));
    }
}
