public class Main {
    //these are attributes
    private String idNumber;
    private String name;
    private double cash;

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

    public String inquire() {
        return this.idNumber + " " + this.name + " : " + this.cash;
    }

    //returns / getters
    public String getIDNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    public double getCash() {
        return cash;
    }
}