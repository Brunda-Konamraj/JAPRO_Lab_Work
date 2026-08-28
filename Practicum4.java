// Super Class demonstrating Compile-Time Polymorphism (Method Overloading)
class Payment {
    public void makePayment(double amount) {
        System.out.println("Processing general payment of ₹" + amount);
    }

    public void makePayment(double amount, String transactionId) {
        System.out.println("Processing general payment of ₹" + amount + " | Transaction ID: " + transactionId);
    }
}

// Subclasses demonstrating Runtime Polymorphism (Method Overriding)
class CreditCardPayment extends Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Processing Credit Card payment of ₹" + amount);
    }
}

class UPIPayment extends Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Processing UPI payment of ₹" + amount);
    }
}

class NetBankingPayment extends Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Processing Net Banking payment of ₹" + amount);
    }
}

// Main class executing dynamic method dispatch and method overloading
public class Practicum4 {
    public static void main(String[] args) {
        // Parent class reference
        Payment payment;

        System.out.println("=== Dynamic Method Dispatch (Runtime Polymorphism) ===");
        
        // Test Case 1: Credit Card Payment
        payment = new CreditCardPayment();
        payment.makePayment(5000.00);

        // Test Case 2: UPI Payment
        payment = new UPIPayment();
        payment.makePayment(1200.50);

        // Test Case 3: Net Banking Payment
        payment = new NetBankingPayment();
        payment.makePayment(8500.00);

        System.out.println("\n=== Method Overloading (Compile-Time Polymorphism) ===");
        
        // Test Case 4: Overloaded method with transaction ID
        payment.makePayment(2500.00, "TXN1001");
    }
}