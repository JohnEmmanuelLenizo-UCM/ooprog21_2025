// DebugFive4.java
// Outputs highest of four numbers
import java.util.*;
class DebugFive4 //removed public
{
   public static void main (String[] args) 
   {
      int one, two, three, four;
      int highest;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an integer >> ");
      one = input.nextInt();
      System.out.print("Enter an integer >> ");
      two = input.nextInt(); //changed to 'two'
      System.out.print("Enter an integer >> ");
      three = input.nextInt(); //changed to 'three'
      System.out.print("Enter an integer >> ");
      four = input.nextInt();//changed to 'four'
      
      highest = one;
      if (highest < two) //fixed if statement
         highest = two;
      if (highest < three) //fixed if statement
         highest = three;
      if (highest < four) //fixed if statement
         highest = four;
      System.out.println("The highest number is " + highest);
   }
}


