package WebAPP.JPApp.Customer;

public class customer {
    private String name;
    private double expense;
    private double balance;

    public customer(String name, double expense, double balance) {
        this.name = name;
        this.expense = expense;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getExpense() {
        return expense;
    }

    public void setExpense(double expense) {
        this.expense = expense;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "customer{" +
                "name='" + name + '\'' +
                ", expense=" + expense +
                ", balance=" + balance +
                '}';
    }
}
