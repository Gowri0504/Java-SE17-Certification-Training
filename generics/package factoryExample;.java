package factoryExample;
abstract class Notification {
    public abstract void sendNotification(String message);
}

// SMS class extends Notification
class SMSNotification extends Notification {

    private String phoneNumber;

    public SMSNotification(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS to " + phoneNumber + ": " + message);
        // Here you could integrate with an SMS API
    }
}

// Email class extends Notification
class EmailNotification extends Notification {

    private String emailAddress;

    public EmailNotification(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Email to " + emailAddress + ": " + message);
        // Here you could integrate with an email service like JavaMail
    }
}

// Test class
public class NotificationTest {
    public static void main(String[] args) {
        Notification sms = new SMSNotification("+1234567890");
        Notification email = new EmailNotification("user@example.com");

        sms.sendNotification("Hello via SMS!");
        email.sendNotification("Hello via Email!");
    }
}