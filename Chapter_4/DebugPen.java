public class DebugPen
{
   private String color;
   private String point;
   
   public DebugPen()
   {
      color = "black";
      point = "fine";
   }
   public DebugPen(String color, String point)
   {
      this.color = color; //added 'this' keyword to call the global variable and assign the value of the arguments
      this.point = point; //added 'this' keyword to call the global variable and assign the value of the arguments
   }
   public String getColor()
   {
      return color;
   }
   public String getPoint()
   {
      return point;
   }
}
