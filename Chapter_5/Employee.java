public class Employee {
    private int employeeNumber;
    private double payRate;
    private final int MAX_EMPLOYEENUMBER = 9999;
    private final double MAX_RATE = 60.00;
    private final double OVERTIME_MULTIPLIER = 1.5;

    public Employee (int employeeNumber, double payRate) {
      if (employeeNumber > 0 && employeeNumber <= MAX_EMPLOYEENUMBER) {
         this.employeeNumber = employeeNumber;
      }
      else {
         System.out.println("Invalid. Employee number must be between 0 and 9999");
         System.exit(0);
      }
      if (payRate > 0 && payRate <= MAX_RATE) {
         this.payRate = payRate;
      }
      else if (payRate > MAX_RATE){
         System.out.println("Invalid. Maxium pay rate is 60.00");
         System.exit(0);
      }
      else if (payRate <= 0) {
         System.out.println("Invalid. Pay rate must not be 0 or less");
         System.exit(0);
      }
    }

    //getters
    public int getEmployeeNumber() {
        return employeeNumber;
    }
    public double getPayRate() {
        return payRate;
    }
    public double getMaxRate() {
        return MAX_RATE;
    }
    public double getOvertimeMultiplier() {
        return OVERTIME_MULTIPLIER;
    }
    //setter
    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
}
