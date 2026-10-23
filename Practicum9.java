public class Practicum9 {

    static class BankAccount {

        private double balance;

        BankAccount(double balance) {
            this.balance = balance;
        }

        synchronized void deposit(double amount) {

            System.out.println(
                Thread.currentThread().getName() +
                " is depositing Rs." + amount
            );

            balance = balance + amount;

            System.out.println(
                "Balance after deposit: Rs." + balance
            );
        }

        synchronized void withdraw(double amount) {

            System.out.println(
                Thread.currentThread().getName() +
                " is withdrawing Rs." + amount
            );

            if (amount <= balance) {

                balance = balance - amount;

                System.out.println(
                    "Balance after withdrawal: Rs." + balance
                );

            } else {

                System.out.println(
                    "Insufficient Balance"
                );
            }
        }

        synchronized void showBalance() {

            System.out.println(
                "Final Balance: Rs." + balance
            );
        }
    }

    static class DepositThread extends Thread {

        BankAccount account;

        DepositThread(BankAccount account) {
            this.account = account;
        }

        public void run() {
            account.deposit(2000);
        }
    }

    static class WithdrawThread extends Thread {

        BankAccount account;

        WithdrawThread(BankAccount account) {
            this.account = account;
        }

        public void run() {
            account.withdraw(3000);
        }
    }

    public static void main(String[] args)
            throws InterruptedException {

        BankAccount account =
            new BankAccount(5000);

        DepositThread userA =
            new DepositThread(account);

        WithdrawThread userB =
            new WithdrawThread(account);

        userA.setName("User A");
        userB.setName("User B");

        userA.start();
        userB.start();

        userA.join();
        userB.join();

        account.showBalance();
    }
}
