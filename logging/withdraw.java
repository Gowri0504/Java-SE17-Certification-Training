import java.util.Scanner;
import java.util.logging.Logger;

public class withdraw {

    public static final Logger l = Logger.getLogger(withdraw.class.getName());

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount to withdraw:");
        double amount = sc.nextDouble();

        double balance = 1000.0;   // Example balance

        l.info("Attempting to withdraw: " + amount);

        if(amount > balance){
            l.warning("Withdrawal amount exceeds balance. Withdrawal failed.");
            l.info("Current balance: " + balance);
        }
        else{
            balance -= amount;
            l.info("Withdrawal successful. New balance: " + balance);
        }

        sc.close();
    }
}