import java.util.Scanner;

class InvalidMarksException extends Exception {
    public InvalidMarksException(String msg) {
        super(msg);
    }
}

class FailException extends Exception {
    public FailException(String msg) {
        super(msg);
    }
}

public class ExamSystem {

    static void checkResult(int marks) throws InvalidMarksException, FailException {

        if (marks < 0 || marks > 100)
            throw new InvalidMarksException("Marks must be between 0-100");

        if (marks < 35)
            throw new FailException("Student failed the exam");

        System.out.println("Result: Pass");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student mark:");
        int marks = sc.nextInt();

        try {
            checkResult(marks);
        } catch (InvalidMarksException | FailException e) {
            System.out.println("Result: " + e.getClass().getSimpleName() + " – " + e.getMessage());
        }
    }
}