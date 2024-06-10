package projects;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public String deposit(double amount) {
        if (amount <= 0) {
            return "Deposit amount must be positive.";
        }
        balance += amount;
        return String.format("Deposited: Rs:%.2f", amount);
    }

    public String withdraw(double amount) {
        if (amount <= 0) {
            return "Withdrawal amount must be positive.";
        }
        if (amount > balance) {
            return "Insufficient funds.";
        }
        balance -= amount;
        return String.format("Withdrew: Rs:%.2f", amount);
    }

    public String checkBalance() {
        return String.format("Current balance: Rs:%.2f", balance);
    }
}

