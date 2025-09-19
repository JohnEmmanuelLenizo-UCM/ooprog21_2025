// This class calculates a waitperson's tip
// as 15% of the bill
import java.util.Scanner;
class DebugThree1 //removed access specifier "public" to support older version of java
{
   public static void main(String[] args) //'String args[]' should be 'String[] args'
   {
      double check1;
      double check2;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the amount of your check >> ");
      check1 = input.nextDouble(); //change to 'input.nextDouble()' instead of 'input.nextInt()' to acccept decimal values
      System.out.print("Enter the amount of your friend's check >> ");
      check2 = input.nextDouble(); //error in 'inputnextInt()' changed to 'input.nextDouble()'
      calcTip(check1);
      calcTip(check2);
   }
   public static void calcTip(double bill) // added 'double bill' parameter 
   {
      final double RATE = 0.15; //syntax error 'doubel RATE' changed to 'double RATE'
      double tip;
      tip = bill * RATE; //Logic error, incorrect formula use 'bill / RATE', changed to 'bill * RATE'
      System.out.println("The tip should be at least $" + tip);
   }
}

