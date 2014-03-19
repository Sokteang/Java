/**
 * Exercise6.24
 * simulate the number of picks needed to get four cards from each 
 * suit and display the four cards picked.
 * 
 * @author Sokteang Ngov
 * <br>
 * Zaman University
 * <br><br>
 * Murat Tutumlu
 * <br>
 * CS 152 Introduction to Java Programming
 * April 3, 2012
 */

public class Exercise6_24 {
  /**
   * Firstly, we define 2 arrays named "suits" with 4 elements, and "ranks" 
   * with 9 elements. We alse define the array "found" as boolean which has 4 
   * elements. The number of picks and count are 0 at first. Count will 
   * increase one by one, and while it is smaller than 4, the number of picks 
   * also increase too. We define index as integer whose value is the random 
   * from 0 to 51. If index / 13 is not 4, the found array is true, while count
   * is increasing. Defind new suit as string which string suit equals to 
   * the index / 13 elements of suits. and rank equals to the remainder of 
   * index / 13 elements of ranks. Finally, it prints rank + " of " + suit.
   * After it loops till count is 4, it will print the number of picks on the 
   * screen.
   */
  public static void main(String[] args) {
    final int NUMBER_OF_CARDS = 52; 
    String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
      "10", "Jack", "Queen", "King"};
    // found indicates whether a suit has been picked
    boolean[] found = new boolean[4]; 

    // Count the number of picks
    int numberOfPicks = 0;
    
    // Count occurrence in each suit
    int count = 0;
    while (count < 4) {
      numberOfPicks++;
      int index = (int)(Math.random() * NUMBER_OF_CARDS);
     
      if (!found[index / 13]) {
        found[index / 13] = true;
        count++;
        
        String suit = suits[index / 13];
        String rank = ranks[index % 13];
        System.out.println(rank + " of " + suit);
      }
    }
    
    System.out.println("Number of picks: " + numberOfPicks);
  }
}
