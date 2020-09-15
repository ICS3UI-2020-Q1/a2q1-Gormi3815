import java.util.Scanner;

public class Main {

  /**
   * this code will tell you if the number you inputed is even or odd
   * @author Isaac
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner(System.in);
     System.out.println("Please enter an integer.");
     int number = input.nextInt();
     int numberRemainder = number % 2;
     if (numberRemainder ==1) { 
       System.out.println (+ number + " is an odd number." );
       }  if (numberRemainder ==0) {
         System.out.println (+ number + " is an even number.");
       }
     }
  }
       

