package record;

record EmployeePayroll(double baseSalary, double allowance, double tax) {

    public EmployeePayroll {
        if (baseSalary < 0) {
            throw new IllegalArgumentException("Base salary cannot be negative");
        }
        if (allowance < 0) {
            throw new IllegalArgumentException("Allowance cannot be negative");
        }
        if (tax < 0) {
            throw new IllegalArgumentException("Tax cannot be negative");
        }
        if (tax > baseSalary + allowance) {
            throw new IllegalArgumentException("Tax cannot exceed gross salary");
        }
    }

    public double netSalary() {
        return (baseSalary + allowance) - tax;
    }
}


public class PayrollApp {
    public static void main(String[] args) {

        EmployeePayroll payroll =
                new EmployeePayroll(50000.0, 15000.0, 8000.0);

        System.out.println("Net Salary: " + payroll.netSalary());
    }
}