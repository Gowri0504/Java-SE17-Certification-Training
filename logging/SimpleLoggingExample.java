import java.util.logging.Logger;
import java.util.logging.Level;

public class SimpleLoggingExample {

    private static final Logger logger = Logger.getLogger(SimpleLoggingExample.class.getName());

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int max = a;
        logger.info("Application started successfully.");
        logger.warning("This is a warning message. Something might be wrong.");
        logger.severe("This is a severe error message! Check immediately.");

        logger.fine("This is a fine-grained debug message."); 
        logger.config("This is a configuration message.");

        withdraw in info
        warning +info if balce <withodrow amt
    }
}
