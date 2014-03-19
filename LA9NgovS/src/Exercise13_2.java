/**
 * Exercise13.2
 * This program is to prompts the user to read two integers and displays 
 * their sum
 * 
 * Sokteang Ngov
 * <br>
 * Zaman University
 * <br><br>
 * Murat Tutumlu
 * <br>
 * CS 152 Introduction to Java Programming
 * May 22, 2012
 */

import java.util.*;
public class Exercise13_2 {
  /**
   * First, the program will ask for 2 integers to display the sum. We define
   * number1 & number2 as the input from the user. We use the Exception try and 
   * catch to catch the error when the user do not enter integers. In the try,
   * integer sum will be the sum of the 2 integers. If the inputs from the user
   * are not integer, it will catch in Exception ex, and prompt the user that 
   * they give the wrong inputs. Then, the users will enter 2 new integers in 
   * the new line. We also have a loop that when the user give 2 right integers,
   * the program will end, but if they are wrong, user can enter 2 other 
   * integers.
   */

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Prompt the user to enter two integers
    System.out.print("Enter two integers: ");
    // contin is true at the beginning
    boolean contin = true;
    /* the loop is used to to stop the program when 2 integers are given from 
     *users, but will loop again when they enter the wrong input 
     */
    do {
      // try to catch if there is error from the input
      try {
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int sum = number1 + number2;
        System.out.println("The sum of " + number1 + " & " + number2 + " are " 
        + sum);
        contin = false;
      }
      // catch the error
      catch (InputMismatchException ex) {
        System.out.println("Try again! the input has to be integer");
        // enter to the new line
        input.nextLine();
      }
    } while (contin);
  }
}
