public class Main {
    /**
     * idNumber is the ID of the account
     * name is the name attached to the account
     * cash is the amount of money in the account
     */
    private String idNumber;
    private String name;
    private double cash;

    /**
     * @param amount to add to the bank
     * @return true if it is a non-negative number
     */
    public boolean credit(double amount) {
        if (amount > 0) {
            this.cash += amount;
            return true;
        }
        return false;
    }

    /**
     * @param amount to be taken from the account
     * @return true if amount taken is less than the money in the account and non-negative
     */
    public boolean debit(double amount) {
        if (amount > 0 && this.cash >= amount) {
            this.cash -= amount;
            return true;
        }
        return false;
    }

    /**
     * @param idNumber the ID number of the account
     * @param name the name of the account
     */
    public Main(String idNumber, String name) {
        this.idNumber = idNumber;
        this.name = name;
        this.cash = 0.0;
    }

    /**
     * @param idNumber the ID number of the account
     * @param name the name of the account
     * @param initialBalance the amount of cash initially in the account
     */
    public Main(String idNumber, String name, double initialBalance) {
        this.idNumber = idNumber;
        this.name = name;
        this.cash = initialBalance;
    }

    /**
     * @return Returns the info about the account
     */
    public String inquire() {
        return this.idNumber + " " + this.name + " : " + this.cash;
    }

    /**
     * Gets idNumber
     * @return Returns the ID number
     */
    public String idNumber() {
        return idNumber;
    }

    /**
     * Gets the name
     * @return Returns the name
     */
    public String name() {
        return name;
    }

    /**
     * Gets the initial cash
     * @return Returns the amount of cash
     */
    public double cash() {
        return cash;
    }
}