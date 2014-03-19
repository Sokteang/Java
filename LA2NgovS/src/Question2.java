  /**
   * Short Explanation: The game is called "scissor rock paper" which one user will play with the computer.  If you win more than two times, you win the game.
   * However, computer will win the game when you lose two times.
   * @author Sokteang Ngov
   * <br>
   * Zaman University
   * <br><br>
   * Murat Tutumlu
   * <br>
   * CS 152 Introduction to Java Programming
   * @since March 13, 2012
   */ 
import java.util.Scanner;
public class Question2 {
  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    // It will read the input from the computer
    Scanner sc = new Scanner(System.in);
    //Define a as integer, and a is the input from the user
    int a = sc.nextInt();
    // i is an integer which equal to 0. When i increases 1 by 1 till smaller or equal to a
    for (int i = 0; i <= a; i++) {
      //j is an integer which equal to a. When i decreases 1 by 1 till it is bigger or equal to 0
      for (int j = a; j >= 0; j--)
        // If i is bigger than j
        if (i - j > 0)
          // It will bring the output, which i-j equals to a decimal number with at least 3 characters for the number
          System.out.printf("%2d*", i - j);
        // If i is smaller than j
        else
          // The output will be space
          System.out.printf("   ");
      // j equals to 1; when j increases 1 by 1 till it is smaller or equal to a
      for (int j = 1; j <= a; j++)
        // If i is bigger than j
        if (i - j > 0)
          //It will bring the output which i-j equals to a decimal number with at least 3 characters for the number
          System.out.printf("%3d", i - j);
        // If it is smaller than j
        else
          // The output will be 3 spaces
          System.out.printf("   ");
      // and it will come to new line
      System.out.println("");
    }

  }

}
/**
 * When we change to System.out printf("%2d*", i - j); 
 * it appears stars on the right of some numbers( the numbers that are on the left)
*/