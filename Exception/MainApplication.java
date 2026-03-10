import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class AccountManager {
    public void withdraw(int balance, int amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance in account");
        }
        System.out.println("Withdrawal Successful");
    }
}

class BankService {
    AccountManager manager = new AccountManager();

    public void processWithdraw(int balance, int amount) throws InsufficientBalanceException {
        manager.withdraw(balance, amount);
    }
}

public class MainApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter balance:");
        int balance = sc.nextInt();

        System.out.println("Enter withdrawal:");
        int amount = sc.nextInt();

        BankService service = new BankService();

        try {
            service.processWithdraw(balance, amount);
        } catch (InsufficientBalanceException e) {
            System.out.println("Transaction Failed");
            System.out.println("Reason: " + e.getMessage());
        }
    }
}