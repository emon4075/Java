package OOPS;

class InvalidAgeException extends Exception {
    InvalidAgeException(String M) {
        System.out.println(M);
    }
}

public class User_Defined_Exception {
    static void Vote(int Age) throws InvalidAgeException {
        if (Age < 18) {
            throw new InvalidAgeException("Age is Not Enough");
        } else {
            System.out.println("Eligible For Voting");
        }
    }

    public static void main(String[] args) {
        try {
            Vote(290);
        } catch (Exception e) {
            System.out.println("Exception Handled");
        }
    }
}
