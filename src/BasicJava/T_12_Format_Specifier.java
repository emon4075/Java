package BasicJava;

public class T_12_Format_Specifier {
    public static void main(String[] args) {
        int I = 10;
        boolean B = true;
        float F = 10.4f;
        double D = 10.556;
        short S = 12;
        char C = 'E';
        System.out.printf("Integer is: %d\n", I);
        System.out.printf("Boolean is: %b\n", B);
        System.out.printf("Float is: %f\n", F);
        System.out.printf("Double is: %.2f\n", D);
        System.out.printf("Short: %d\n", S);
        System.out.printf("Character: %c\n", C);
    }
}
