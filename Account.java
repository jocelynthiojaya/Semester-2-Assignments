public class Account {
    private double balance;

    public Account(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean withdraw(double amount) {
        if(this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean deposit(double amount){
        this.balance += amount;
        return true;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }
}
