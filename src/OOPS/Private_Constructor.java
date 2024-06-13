package OOPS;

public class Private_Constructor {
    String Name;

    private Private_Constructor(String Name) {
        this.Name = Name;
    }

    public static void main(String[] args) {
        Private_Constructor Emon = new Private_Constructor("Emon");
        System.out.println(Emon.Name);
    }
}
