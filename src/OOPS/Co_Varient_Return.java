package OOPS;

class CO {
    CO Show() {
        System.out.println("Super Class");
        return this;
        // return new CO();
    }
}

class newCO extends CO {
    @Override
    newCO Show() {
        super.Show();
        System.out.println("Sub Class");
        return this;
    }
}

public class Co_Varient_Return {
    public static void main(String[] args) {
        newCO Obj = new newCO();
        Obj.Show();
    }
}
