// This class uses a DebugCircle class
// to instantiate a Circle object
import java.util.Scanner;
class DebugFour1
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      DebugCircle c;
      int radius;

      System.out.print("Enter a radius for a circle >> ");
      radius = input.nextInt();
      input.close();
      c = new DebugCircle(radius);

      System.out.println("The radius is " + c.getRadius());
      System.out.println("The diameter is " + c.getDiameter());
      System.out.println("The area is " + c.getArea());
   }
}

/*code fixes
 * fixed statement "Circle c = new Circle();" to "DebugCircle c;"
 * added 'input.close()' to close the Scanner object 'input'
 * fixed statement "c = new DebugCircle(c);" into "c = new DebugCircle(radius);" to pass the 'radius' variable as an argument and instantiate the 'c circle object
 * In statement "System.out.println("The radius is " + c.getRad());" changed the method to "c.getRadius" to retrieve the radius value
 * In statement "System.out.println("The diameter is " + c.getDiam());" changed the method to "c.getDiameter()" to retrieve the diameter value
 */

