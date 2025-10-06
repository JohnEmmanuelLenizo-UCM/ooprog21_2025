import java.util.Scanner;

class Payroll {
    public static void main(String[] a) {
        Scanner input = new Scanner(System.in);
        int hoursWorked;
        double payRate, overtimePay, regularPay;
        Employee employeeOne;

        System.out.print("How many hours did you work this week? ");
        hoursWorked = input.nextInt();
        System.out.print("What is your regular pay rate? ");
        payRate = input.nextDouble();

        employeeOne = new Employee(1, payRate);
        //employeeOne.setPayRate(checkPayRate(employeeOne)); //remove if not used like in the sample output provided (pay rate limiter)

        regularPay = calculateRegularPay(hoursWorked, employeeOne);
        overtimePay = calculateOvertimePay(hoursWorked, employeeOne);
        displayOutput(regularPay, overtimePay);

        input.close();
        System.exit(0);
    }
    //methods
    
    /*public static double checkPayRate(Employee e) { //remove if not used like in the sample output provided (pay rate limiter)
        double payRate = e.getPayRate();
        if (payRate > e.getMaxRate()) {
            payRate = e.getMaxRate();
        }
        return payRate;
    }*/
    public static double calculateRegularPay(int hoursWorked, Employee e) {
        double result;
        int hours;
        if (hoursWorked > 40) {
            hours = 40;
        }
        else {
            hours = hoursWorked;
        }
        result = hours * e.getPayRate();
        return result;
    }
    public static double calculateOvertimePay (int hoursWorked, Employee e) {
        double result = (hoursWorked - 40) * e.getPayRate() * e.getOvertimeMultiplier();
        return result;
    }
    public static void displayOutput(double regularPay, double overtimePay) {
        System.out.println("Regular pay is " + regularPay);
        System.out.println("Overtime pay is " + overtimePay);
    }
    
}