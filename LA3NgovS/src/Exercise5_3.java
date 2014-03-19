/**
 * Exercise5.3
 * The program will let user to enter one positive integer and check whether it is the 
 * palindrome number or not
 * 
 * @author Sokteang Ngov
 * <br>
 * Zaman University
 * <br><br>
 * Murat Tutumlu
 * <br>
 * CS 152 Introduction to Java Programming
 * March 27, 2012
 */
	
import java.util.Scanner;
public class Exercise5_3 {
	/**
	 *After the user enter one integer number, the computer will check the number 
	 *whether it is palindrome or not.How?first, it will compare the number and 
	 *the reverse number. If they are the same, it will return that the number is 
	 *palindrome. If they are not the same, it will return that the number is not 
	 *palindrome. We define Result as 0 then, check if the user's number is 
	 *different from 0, it will divide the number by 10 to find the remainder.
	 *Then, the new result will equal to the remainder. The number divide by 10 
	 *will be the new number.The memory keeps the new number in its memory. It 
	 *will check again if the new number is 0 or not. If it is not 0, then it 
	 *will loop again and again untill it is 0. But if the new number is 0, then 
	 *it check whether it is different from the Resutl or not. If they are the 
	 *same, the number will be palindrome, but if they are not the same, the 
	 *number is not palindrome. 
	 */
  public static void main(String[] args) {
  		// TODO Auto-generated method stub
  
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a postive integer: ");
    int number = input.nextInt();
    if (isPalindrome(number)) 
      System.out.println(number + " is palindrome");
    else
      System.out.println(number + " is not palindrome");
  }	  
  public static boolean isPalindrome(int number) {
  	return number == reverse(number);
  }
  public static int reverse(int number) {
  	int result = 0;
  	while (number != 0) {
      int remainder = number % 10;
  	  result = result * 10 + remainder;
      number = number / 10;
  	}
  	return result;
  }	  
}  
		  

