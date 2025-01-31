public class Account {
    // Attributes
    private String id;
    private String name;
    private int balance = 0;

    // Constructors
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Behaviour methods
    public String getID() {
        return "ID: " + this.id;
    }

    public String getName() {
        return "Name: " + this.name;
    }

    public int getBalance() {
        return this.balance;
    }

    // Credit method
    public int credit(int amount) {
        this.balance += amount;
        return this.balance;
    }

    // Debit method
    public int debit(int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }

    // Transfer method
    public int transferTo(Account otherAcc, int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            otherAcc.balance += amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }

    // toString Method for displaying account info
    public String toString() {
        return "Account ID: " + this.id + " Name: " + this.name + " Balance: " + this.balance;
    }

}
