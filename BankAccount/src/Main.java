public class Main {
    //these are attributes
    private String idNumber;
    private String name;
    private double cash;

    //methods
    public boolean credit(double amount) {
        if (amount > 0) {
            this.cash += amount;
            return true;
        }
        return false;
    }

    public boolean debit(double amount) {
        if (amount > 0 && this.cash >= amount) {
            this.cash -= amount;
            return true;
        }
        return false;
    }

    //these are constructors
    public Main(String idNumber, String name) {
        this.idNumber = idNumber;
        this.name = name;
        this.cash = 0.0;
    }

    public Main(String idNumber, String name, double initialBalance) {
        this.idNumber = idNumber;
        this.name = name;
        this.cash = initialBalance;
    }

    public String inquire() {
        return this.idNumber + " " + this.name + " : " + this.cash;
    }

    public String idNumber() {
        return idNumber;
    }

    public String name() {
        return name;
    }

    public double cash() {
        return cash;
    }
}