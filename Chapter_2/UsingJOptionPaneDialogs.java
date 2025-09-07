import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {

   public static void main(String[] a) {
      int confirmation = 1;
      String name = "";
      
      do {
         name = JOptionPane.showInputDialog(null, "What is your name?");
         
         if (name == null) {
            JOptionPane.showMessageDialog(null, "Operation Cancelled.");
            break;
         }
         else if (name.isEmpty() || name.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter a valid name.");
            continue;
         }  
         else {
         confirmation = JOptionPane.showConfirmDialog(null, "Do you want to proceed?", "Confirmation", JOptionPane.YES_NO_OPTION);
         }
         
      } while(confirmation == 1);
      
      if (name != null) JOptionPane.showMessageDialog(null, "Hello, " + name + "!");   
   }
}