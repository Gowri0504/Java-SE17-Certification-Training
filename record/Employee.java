package record;

import java.util.Scanner;

record Employee1(String Name, double Salary){}

public class Employee {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();

        Employee1 e = new Employee1(name, salary);
        System.out.println(e);

        if (salary == 0) {
            throw new IllegalArgumentException("Salary cannot be zero");
        } 
        else if (salary > 20000) {
            System.out.println("Not Eligible for Loan");
        } 
        else {
            System.out.println("Eligible for Loan");
        }

        sc.close();
    }
}