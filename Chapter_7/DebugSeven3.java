// Program accepts a String and displays some facts
import java.util.*;
class DebugSeven3{
   public static void main(String[] args){

      Scanner kb = new Scanner(System.in);
      String quote, charString;
      char searchChar;
      
      System.out.print("Enter a famous quote >> ");
      quote = kb.nextLine(); //called scanner object 'kb' before nextLine()
      
      System.out.print("Enter a character to search for >> ");
      charString = kb.next();// kb.nextInt() is changed to kb.next() to return to string instead of int
      
      searchChar = charString.charAt(0);
      System.out.println("index of('" + searchChar + "') is: " + quote.indexOf(searchChar)); // missing a closing parenthesis 
      
      System.out.println("indexOf('a') is: " + quote.indexOf('a')); // missing a parenthesis for the indexOF('a');
      System.out.println("indexOf('x') is: " + quote.indexOf('x'));
      System.out.println("charAt(5) is: " + quote.charAt(5));
      System.out.println("replace('e', '*') is: " +
      quote.replace('e', '*')); //misspelled, must be replace instead of repplace
   }
}
