import java.util.Scanner;

class AccountLockedException extends Exception {
    public AccountLockedException(String msg) {
        super(msg);
    }
}

public class ATMSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int correctPin = 1234;
        int attempts = 0;

        try {
            while (attempts < 3) {

                System.out.println("Enter PIN:");
                int pin = sc.nextInt();

                if (pin == correctPin) {
                    System.out.println("Access Granted");
                    return;
                }

                attempts++;
            }

            throw new AccountLockedException("Too many failed attempts");

        } catch (AccountLockedException e) {
            System.out.println("AccountLockedException: " + e.getMessage());
        }
    }
}