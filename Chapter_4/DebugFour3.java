// This class uses a DebugBox class
// to instantiate two Box objects
import java.util.Scanner;
public class DebugFour3
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int w, l, h;

      System.out.print("Enter width of box >> ");
      w = input.nextInt(); 
      input.nextLine(); //added 'input.nextLine()' to consume the leftover newline

      System.out.print("Enter length of box >> ");
      l = input.nextInt(); 
      input.nextLine(); //added 'input.nextLine()' to consume the leftover newline

      System.out.print("Enter height of box >> ");
      h = input.nextInt();
      input.nextLine(); //added 'input.nextLine()' to consume the leftover newline

      DebugBox box1 = new DebugBox(); 
      DebugBox box2 = new DebugBox(w, l, h); 

      System.out.println("The dimensions of the first box are");
      box1.showData();
      System.out.print("  The volume of the first box is ");
      showVolume(box1);

      System.out.println("The dimensions of the second box are");
      box2.showData();
      System.out.print("  The volume of the second box is ");
      showVolume(box2); 

      input.close();
   }
   public static void showVolume(DebugBox aBox)
   {
      double vol = aBox.getVolume();
      System.out.println(vol);
   }
}

/*code fixes
 * fixed 'input.nextInteger()' to 'input.nextInt()'
 * fixed 'input.nextDouble()' to 'input.nextInt()'
 * changed 'FixDebugBox()' to 'DebugBox()'
 * changed 'FixDebugBox(w, l, h)' to 'DebugBox(w, l, h)' and renamed the 'box1' variable to 'box2'
 * changed to 'showVolume(box2)' instead of 'box2.showVolume();'
 */

