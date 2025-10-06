public class Employee {
    private int employeeNumber;
    private double payRate;
    private final int maxEmployeeNumber = 9999;
    private final double maxRate = 60.00;
    private final double overtimeMultiplier = 1.5;

    public Employee (int employeeNumber, double payRate) {
        this.employeeNumber = employeeNumber;
        this.payRate = payRate;
    }

    //getters
    public int getEmployeeNumber() {
        return employeeNumber;
    }
    public double getPayRate() {
        return payRate;
    }
    public double getMaxRate() {
        return maxRate;
    }
    public double getOvertimeMultiplier() {
        return overtimeMultiplier;
    }
    //setter
    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
}