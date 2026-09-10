public class Practicum7 {


    static class InsufficientBalanceException
            extends Exception {


        InsufficientBalanceException(String message) {
            super(message);
        }
    }


    static class BankAccount {


        double balance;


        BankAccount(double balance) {
            this.balance = balance;
        }


        void withdraw(double amount)
                throws InsufficientBalanceException {


            if (amount <= 0) {
                throw new IllegalArgumentException(
                    "Withdrawal amount must be greater than zero"
                );
            }


            if (amount > balance) {
                throw new InsufficientBalanceException(
                    "Insufficient balance"
                );
            }


            balance = balance - amount;


            System.out.println(
                "Withdrawal successful: Rs." + amount
            );
        }


        void showBalance() {
            System.out.println(
                "Available Balance: Rs." + balance
            );
        }
    }


    public static void main(String[] args) {


        BankAccount account = new BankAccount(10000);


        try {


            account.showBalance();


            account.withdraw(15000);


        } catch (InsufficientBalanceException e) {


            System.out.println(
                "Transaction Failed: " + e.getMessage()
            );


        } catch (IllegalArgumentException e) {


            System.out.println(
                "Invalid Transaction: " + e.getMessage()
            );


        } finally {


            System.out.println("ATM transaction completed");
        }


        account.showBalance();
    }
}
