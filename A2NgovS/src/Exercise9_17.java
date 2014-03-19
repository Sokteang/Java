/**
 * Exercise9.17
 * The program will take file from the users and count the words, characters,
 * and lines of the file.
 *
 * Sokteang Ngov
 * <br>
 * Zaman University
 * <br><br>
 * Murat Tutumlu
 * <br>
 * CS 152 Introduction to Java Programming
 * April 18, 2012
 */
import javax.swing.JFileChooser;
import java.util.Scanner;
public class Exercise9_17 {
/**
 * First, we need to take the file from the users, using the fileChoosing 
 * method. Then, using the file, the code will read by line. The line will be 
 * counted and increased.We also define an array as string, which is spilted by 
 * space. We do not include space, so it will count the length of the array 
 * when there is a space and store it in memory. Then, after the space, it will 
 * count the another element of the array and add them with the last element of
 * the array, then the sum of those length will be wordcount. That is how we 
 * got the wordcount. We make a For loop, which i start from 0, i will increase 
 * while it is smaller than the length of the array, define the charactercount 
 * as integer, and it equals to the sum of i element of the array. That's how 
 * we got all of the characters counted. Finally, just print the linecount, 
 * wordcount, and charactercount on the screen.
 */
  public static void main(String[] args)  throws Exception {
    int linecount = 0;
    int wordcount = 0;
    int charactercount = 0;  
    JFileChooser fileChooser = new JFileChooser();
    /**
     * Choose the file from the users, then scan the file, and count the words,
     * lines, and characters using the below method 
     */
    if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
      // Get the selected file
      java.io.File file1 = fileChooser.getSelectedFile();
      // Created a scanner for a file
      Scanner input = new Scanner(file1);
      // Read the text from the file
      while (input.hasNext()) {
        String line = input.nextLine();
        linecount++;
        // The array will be split by space
        String[] array = line.split(" ");
        wordcount +=  array.length;
        // Get all character from the file
        for (int i = 0; i < array.length; i++) {
         charactercount += array[i].length();
        }  
      }
      System.out.println("Your file has:");
      System.out.println(charactercount + " characters");
      System.out.println( wordcount + " words"); 
      System.out.println(linecount + " lines");
    }
  }
}
