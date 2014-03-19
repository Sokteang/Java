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
public class Exercise7 {

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.out.println("Enter the tuition this year:");
    int count = 2;
    Scanner mon = new Scanner(System.in);
    double tuition = mon.nextDouble();   
    System.out.println("The tuition for year 1 is $" + tuition);
    while (count <= 10) {
    tuition *= 1.05; 
    System.out.println("The tuition for year " + count + " is $" + tuition);
    count++;     
     }
    System.out.println("");
    for (count = 11; count <= 14; count++) {
      tuition *= 1.05;
        System.out.println("The tuition for year " + count + " is " + tuition); 
        
    }
    
  } 
}
