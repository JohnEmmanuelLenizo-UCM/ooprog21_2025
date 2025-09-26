// This class uses a DebugPen class
// to instantiate two Pen objects
// One with default values
// and the other with user-supplied values
import java.util.Scanner;
public class DebugFour2
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String color;
      String point;
      DebugPen pen1;
      DebugPen pen2;

      System.out.print("Enter a color ink for the pen >> ");
      color = input.nextLine();

      System.out.print("Enter a point size - fine, medium, or thick >> ");
      point = input.nextLine();

      pen1 = new DebugPen();
      pen2 = new DebugPen(color, point);
      
      System.out.println("Default value pen:");
      display(pen1);
      System.out.println("User value pen:");
      display(pen2);

      input.close();
   }
   public static void display(DebugPen p)
   {
      System.out.println("   The pen has ink color " + p.getColor());
      System.out.println("      and a " + p.getPoint() + " point.");
   }
}

/*Code Fixes
 * Fixed pen2 instantiation. "pen2 = new DebugPen(point, color);" changed to "pen2 = new DebugPen(color, point);"
 * Fixed display method. Changed 'display(FixDebugPen p)' to 'display(DebugPen p)'
 * Fixed statement "System.out.println("      and a " + p1.getPoint() + " point.");" to "System.out.println("      and a " + p.getPoint() + " point.");"
 * Fixed "display(pen22);" to "display(pen2);"

 */
