package OOPS;

public class Null_Pointer_Exception {
    @SuppressWarnings("null")
    public static void main(String[] args) {
        String Name = null;
        try {
            System.out.println(Name.toUpperCase());
        } catch (Exception e) {
            System.out.println("Null Pointer Can't Be Converted To Upper-Case");
        }
    }
}
