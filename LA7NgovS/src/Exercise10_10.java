/**
 * Exercise10.10
 * This program is guess the user birthday using five two-dimensional arrays
 * 
 * Sokteang Ngov
 * <br>
 * Zaman University
 * <br><br>
 * Murat Tutumlu
 * <br>
 * CS 152 Introduction to Java Programming
 * April 28, 2012
 */

import java.util.Scanner;
public class Exercise10_10 {
  /**
   * First of all, integer date and i are 0, i will increases when it is 
   * smaller than 5, it will print out the question "Is your birthday in Set " 
   * and number of Set will be i + 1. J and k will be the number of rows and 
   * columns, which are 4 and 4. when they are smaller than 4, GuessDate method
   * will be printed and an empty line. During that time, user will enter 
   * number 1 if her birthdate is in those number and 0 if not. Integer answer
   * will be the input from user. If user enter number 1, the date will be the 
   * before date + GuessDate. After i is 5, it will print the birthday date.
   */
  public static void main(String[] args) {
    int date = 0; // Date to be determined
    int answer;
    // Create a Scanner
    Scanner input = new Scanner(System.in);
    for (int i = 0; i < 5; i++) {
      System.out.println("Is your birthday in Set" + (i + 1) + "?");
      for (int j = 0; j < 4; j++) {
        for (int k = 0; k < 4; k++)
        System.out.print(GuessDate.getValue(i, j, k) + " ");
        System.out.println();
      }
      System.out.print("\nEnter 0 for No and 1 for Yes: ");
      answer = input.nextInt(); 
      if (answer == 1)
      date += GuessDate.getValue(i, 0, 0);
    }  
    System.out.println("Your birthday is " + date);
  }
}
