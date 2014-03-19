/**
 *Exercise6.12
 *This program designs to print out the reverse of 10 numbers from the users.
 * 
 * @author Sokteang Ngov
 * <br>
 * Zaman University
 * <br><br>
 * Murat Tutumlu
 * <br>
 * CS 152 Introduction to Java Programming
 * April 9, 2012
 */
public class Exercise6_12 { 
  /**
   * First of all, we scan the input from the users. Then we develop a new 
   * method for the reverse numbers. Define another new array whose length is 
   * the same as the length of numbers from the users. Integer i = 0; 
   * j is the last number from the user; while i is smaller than the length 
   * of the numbers from the user; i will increase and j will decrease. and 
   * the element of the new array will become the element of the old array by 
   * the time it finishes the loop. To print the new array on the screen, we 
   * just write a for loop inside the main method, and print it out.
   * 
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    java.util.Scanner input = new java.util.Scanner(System.in); 
    System.out.println("Enter 10 numbers: ");
    int number[] = new int[10];
    // take the numbers from the users
    for (int i = 0; i < 10; i++ ) {
      number[i] = input.nextInt(); 
    }
    System.out.println("The reverse of those numbers are:");
    // define a new array that can print the element of the reverse numbers
    int revers[] = reverse(number);
    for (int i = 0; i < revers.length; i++) {
      System.out.print(revers[i] + " ");
    }
  }
  /**
   * function to produce reverse numbers. Define a new array called result[].  
   * Its length is the same as the length of the original array called number[].
   * Integer i = 0; j is the last number from the user; while i is smaller
   *  than the length of the numbers from the user; i will increase and j will
   * decrease. and the element of the new array will become the element of
   * the old array by the time it finishes the loop.
   */
  public static int[] reverse(int[] number) { 
    int[] result = new int[number.length];  
     for (int i = 0, j = result.length - 1; i < number.length; i++, j--) {
     result[j] = number[i];
     }
     // return the new array
     return result; 
  }
}

