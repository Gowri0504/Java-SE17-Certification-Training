// Functional Interface
@FunctionalInterface
interface MathOperation {
    double operate(double a, double b);
}

public class LambdaMath {

    public static void main(String[] args) {

        MathOperation add = (a, b) -> a + b;

        MathOperation multiply = (a, b) -> a * b;

        MathOperation power = (a, b) -> Math.pow(a, b);

        System.out.println("Addition: " + add.operate(10, 5));
        System.out.println("Multiplication: " + multiply.operate(10, 5));
        System.out.println("7 Power 2: " + power.operate(7, 2));
    }
}