import java.util.Scanner;

class OutOfStockException extends Exception {
    public OutOfStockException(String msg) {
        super(msg);
    }
}

class PaymentFailedException extends Exception {
    public PaymentFailedException(String msg) {
        super(msg);
    }
}

public class OrderSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product quantity:");
        int quantity = sc.nextInt();

        System.out.println("Available stock:");
        int stock = sc.nextInt();

        try {

            if (quantity > stock)
                throw new OutOfStockException("Product out of stock");

            System.out.println("Enter payment status (true/false):");
            boolean payment = sc.nextBoolean();

            if (!payment)
                throw new PaymentFailedException("Payment failed");

            System.out.println("Order Confirmed");

        } catch (OutOfStockException | PaymentFailedException e) {
            System.out.println("Order Failed");
            System.out.println("Reason: " + e.getMessage());
        }
    }
}