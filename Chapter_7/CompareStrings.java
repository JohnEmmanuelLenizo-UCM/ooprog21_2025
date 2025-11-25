import java.util.Scanner;

class CompareStrings {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String str1 = "Carmen";      
      String str2;
      
      System.out.print("Enter your name > ");
      str2 = input.nextLine();
      if (str2.equals(str1)) {
         System.out.println("Carmen equals " + str2);
      }
      else {
         System.out.println("Carmen does not equal to " + str2);
      }
   }      
}