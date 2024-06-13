package BasicJava;

public class T_73_Foor_Each_Loop {
    public static void main(String[] args) {
        int[] Numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int i : Numbers) {
            System.out.println(i);
        }
        String[] names = new String[5];
        names[0] = "Emon";
        names[1] = "Saad";
        names[2] = "Anik";
        names[3] = "Emran";
        names[4] = "Fahim";
        for (String string : names) {
            System.out.println(string);
        }
    }
}
