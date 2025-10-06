import java.util.Scanner;

class Payroll {
    public static void main(String[] a) {
        Scanner input = new Scanner(System.in);
        int employeeNumber;
        double hoursWorked, payRate, overtimePay, regularPay;
        Employee employeeOne;
        
        System.out.print("Enter employee number: ");
        employeeNumber = input.nextInt();
        System.out.print("How many hours did you work this week? ");
        hoursWorked = input.nextDouble();
        System.out.print("What is your regular pay rate? ");
        payRate = input.nextDouble();

        employeeOne = new Employee(employeeNumber, payRate);

        regularPay = calculateRegularPay(hoursWorked, employeeOne);
        overtimePay = calculateOvertimePay(hoursWorked, employeeOne);
        displayOutput(regularPay, overtimePay);

        input.close();
        System.exit(0);
    }
    //methods
    public static double calculateRegularPay(double hoursWorked, Employee e) {
        double result;
        double hours;
        if (hoursWorked > 40) {
            hours = 40;
        }
        else {
            hours = hoursWorked;
        }
        result = hours * e.getPayRate();
        return result;
    }
    public static double calculateOvertimePay (double hoursWorked, Employee e) {
        double result = (hoursWorked - 40) * e.getPayRate() * e.getOvertimeMultiplier();
        return result;
    }
    public static void displayOutput(double regularPay, double overtimePay) {
        System.out.println("Regular pay is " + regularPay);
        System.out.println("Overtime pay is " + overtimePay);
    }
    
}
