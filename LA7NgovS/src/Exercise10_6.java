/**
 * Exercise10.6
 * This program is written to display the prime number under 120 in decreasing 
 * order (reversing order)
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

public class Exercise10_6 {
  /**
   * First of all, we construct an empty stack. Integer count is 0. LIMIT is 
   * a constant which is always 120. Integer number = 2, i will increase when 
   * it is smaller than LIMIT. If isPrime method is true, stack.push has the 
   * element of number, and count will increase and store in the memory. It 
   * also appears "The prime numbers less than 120 are" and a new empty line.
   * NUMBER_PER_LINE is a constant of 10. While stack.empty method is false, 
   * printout stack.pop method and space. If the element of the stack divide by
   * 10 has 0 remainder, print space which means that the number for each line
   * has only 10 numbers. number will start from 2 and increase while it is 
   * below 120. The isPrime method is true at the begining. divisor is also 2 
   * and keep increasing. If number divide by divisor has 0 remainder, isPrime
   * become false, and check the condition in for loop again. If divisor is 
   * bigger than number / 2, stop the for loop, and return isPrime.
   */
  public static void main(String[] args) {
    final int LIMIT = 120;
    int count = 0;
    StackOfIntegers stack = new StackOfIntegers();
    // if isPrime(number) is true, print stack.push(number), and increase count
    for (int number = 2; number < LIMIT; number++)
      if (isPrime(number)) {
        stack.push(number);
        count++; // 
      }

    // print the words and print new line
    System.out.println("The prime numbers less than " + LIMIT + " are \n");
    final int NUMBER_PER_LINE = 10;
    // while not stack.empty(), print stack.pop and space
    while (!stack.empty()) {
      System.out.print(stack.pop() + " ");
      // if the remainder of stack.getSize() divide by 10 is 0
      if (stack.getSize() % NUMBER_PER_LINE == 0)
        System.out.println(); // print space
    }
  }
  /*
   * number will start from 2 and increase while it is below 120. The isPrime 
   * method is true at the begining. divisor is also 2 and keep increasing. If 
   * number divide by divisor has 0 remainder, isPrime become false, and check
   * the condition in for loop again. If divisor is bigger than number / 2, 
   * stop the for loop, and return isPrime.
   */
  public static boolean isPrime(int number) {
    // first, the method is true
    boolean isPrime = true;
    // when divisor is 2, divisor will increase when it is smaller than number 
    // divide by 2
    for (int divisor = 2; divisor <= number / 2; divisor++) {
      // if the remainder of number divide by divisor is 0
      if (number % divisor == 0) {
        // isPrime become false
        isPrime = false;
        break; // stop the loop
      }
    }
    return isPrime;
  }
}
