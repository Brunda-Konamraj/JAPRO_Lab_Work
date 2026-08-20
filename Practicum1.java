import java.util.Scanner;

class BankAccount {
    private String name;
    private int accNum;
    private String type;
    private double balance;

    public BankAccount(String name, int accNum, String type, double balance) {
        this.name = name;
        this.accNum = accNum;
        this.type = type;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount + " | Balance: ₹" + balance);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount + " | Remaining: ₹" + balance);
        }
    }

    public void balanceEnquiry() {
        System.out.println("\nName: " + name + " | Acc No: " + accNum + " | Type: " + type + " | Balance: ₹" + balance);
    }
}

public class Practicum1 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Ravi", 1001, "Savings", 10000.0);
        acc.balanceEnquiry();
        acc.deposit(5000.0);
        acc.withdraw(3000.0);
        acc.withdraw(15000.0); // Insufficient funds test
    }
}

