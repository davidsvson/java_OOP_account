public class Account {
    private double balance;
    private String name;

    private static int count = 0; // klass variabel - gemensam för alla instanser (objekt)

    public Account() {
        this.balance = 0.0;
        this.count++;
    }

    public Account(double startBalance) {
        this.balance = startBalance;
        this.count++;
    }

    public Account(double balance, String name) {
        this.balance = balance;
        this.name = name;
        this.count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
        //balance = balance + amount;
    }

    public double withdraw(double amount) {
        if (this.balance >= amount && amount > 0) {
            this.balance -= amount;
            return amount;
        }
        return 0;
    }


}
