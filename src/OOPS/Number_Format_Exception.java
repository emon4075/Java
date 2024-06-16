package OOPS;

public class Number_Format_Exception {
    public static void main(String[] args) {
        String Number = "ABC";
        // String Number = "123";
        try {
            int N = Integer.parseInt(Number);
            System.out.println("Converted Into Number: " + N);
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception. Please Give Numbered String.");
        }
    }
}
