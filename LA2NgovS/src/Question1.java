
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
public class Question1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  // Define count as zero 
	  int count = 0; 
	    // if count is smaller than 2 or -2
	    while (count <= 2 || count <= -2) {
	      // The number from the computer will be in between 0, 1, and 2
	      int computerNumber = (int) (Math.random() * 3);
	      // Scanner will read the input from the user
	      java.util.Scanner input = new java.util.Scanner(System.in);
	      // It will appear "scissor (0), rock (1), paper (2)
	      System.out.print("scissor (0), rock (1), paper (2): ");
	      // Define userNumber as integer which is the number that the user will put
	      int userNumber = input.nextInt();
	      // For the number that the computer chose
	      switch (computerNumber) {
	      // If the computer chose number 0
	      case 0:
	        // If the user chose number 0 too
	        if (userNumber == 0) {
	          // It will appear "It is a draw"
	          System.out.println("It is a draw");
	          // If the user chose number 1
	        } else if (userNumber == 1) {
	          // Then it will appear "You won"
	          System.out.println("You won");
	          // This will add 1 to know how many times you had won the game
	          count++;
	          // If the user chose number 2 
	        } else if (userNumber == 2) {
	          // It will appear "You lost"
	          System.out.println("You lost");
	          // This will reduce 1 times when you lost the game
	          count--;
	        }
	        // This will end the process when the computer chose number 0 and end the switch statement
	        break;
	      // If the computer chose number 1
	      case 1:
	        // If the user chose number 0
	        if (userNumber == 0) {
	          // It will appear "You lost"
	          System.out.println("You lost");
	          // This will reduce 1 times when you lost the game
	          count--;
	          // If the user chose number 1
	        } else if (userNumber == 1) {
	          // It will appear "It is a draw"
	          System.out.println("It is a draw");
	          // If the user chose number 2
	        } else if (userNumber == 2) {
	          // It will appear "You won"
	          System.out.println("You won");
	          // This will add 1 to know how many times you had won the game
	          count++;
	        }
	        // This will end the process when the computer chose number 1 and end the switch statement
	        break;
	      // If the computer chose number 2
	      case 2:
	        // If the user chose number 0
	        if (userNumber == 0) {
	          // It will appear "You won"
	          System.out.println("You won");
	          // This will add 1 to know how many times you had won the game
	          count++;
	          // If the user chose number 1
	        } else if (userNumber == 1) {
	          // It will appear "You lost"
	          System.out.println("You lost");
	          // This will reduce 1 times when you lost the game
	          count--;
	          // If the user chose number 2
	        } else if (userNumber == 2) {
	          // It will appear "It is a draw"
	          System.out.println("It is a draw");
	        }
	        // This will end the process when the computer chose number 2 and end the switch statement
	        break;
	       
	      }
	    }
	    // If the number of count is bigger than 2
	    if (count > 2) {
	      // It will produce "You won more than two times"
	      System.out.println("You won more than two times");
	      // If count is not bigger than 2 
	    } else {
	      // It means that computer won more than two times
	      System.out.println("The computer won more than two times");
	      
	    }
	}

}
