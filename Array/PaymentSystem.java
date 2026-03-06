// Payment interface
interface Payment {
    double calculateFee(double amount);
}

// UPI payment class
class UPI implements Payment {

    public double calculateFee(double amount) {
        return amount * 0.01;   // 1% fee
    }
}

// Credit Card payment class
class CreditCard implements Payment {

    public double calculateFee(double amount) {
        return amount * 0.025;   // 2.5% fee
    }
}

// NetBanking payment class
class NetBanking implements Payment {

    public double calculateFee(double amount) {
        return 50;   // Flat ₹50 fee
    }
}


// Payment Processor
class PaymentProcessor {

    public static void processPayment(Payment payment, double amount) {

        double fee = payment.calculateFee(amount);
        double total = amount + fee;

        System.out.println("Amount: " + amount);
        System.out.println("Transaction Fee: " + fee);
        System.out.println("Total Deducted: " + total);
    }
}

// Main class
public class PaymentSystem {

    public static void main(String[] args) {

        double amount = 1000;

        Payment upi = new UPI();
        Payment credit = new CreditCard();
        Payment netbank = new NetBanking();

        System.out.println("UPI Payment");
        PaymentProcessor.processPayment(upi, amount);

        System.out.println("\nCredit Card Payment");
        PaymentProcessor.processPayment(credit, amount);

        System.out.println("\nNetBanking Payment");
        PaymentProcessor.processPayment(netbank, amount);
    }
}

interface Payment {
    double calculateFee(double amount);
}
main class PaymentSystem {

    public static void main(String[] args) {
        double amount = 1000;

        Payment upi = new UPI();
        Payment credit = new CreditCard();
        Payment netbank = new NetBanking();

        System.out.println("UPI Payment");
        PaymentProcessor.processPayment(upi, amount);

        System.out.println("\nCredit Card Payment");
        PaymentProcessor.processPayment(credit, amount);

        System.out.println("\nNetBanking Payment");
        PaymentProcessor.processPayment(netbank, amount);
    }
}