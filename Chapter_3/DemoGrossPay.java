class DemoGrossPay {

   final static double fixedHourlyRate = 22.75;
   
   public static void main(String[] args) {
      calculateGross(10.0);
      calculateGross(25.0);
      calculateGross(37.5);
   }
   public static void calculateGross(double hoursWorked) {
      double gross = hoursWorked * fixedHourlyRate;
      String output = hoursWorked + " hours at $" + fixedHourlyRate + " per hour is $" + gross;
      System.out.println(output);
   }
}