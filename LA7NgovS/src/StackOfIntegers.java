/**
 * Exercise10.6
 * This program is written to display the prime number under 120 in decreasing 
 * order (reversing order)
 * Sokteang Ngov
 * <br>
 * Zaman University
 * <br><br>
 * Murat Tutumlu
 * <br>
 * CS 152 Introduction to Java Programming
 * April 28, 2012
 */

public class StackOfIntegers {
  /**
   * Private array element and privat integer size. The capacity will be 16. 
   * element will has 16 elements. Create another method named push. If size is 
   * bigger than 16, new array temp will have its element of 32. Copy the
   * element of array elements to the array temp. So array temp and elements 
   * will have the same element, and value which is number will be 
   * elements[size++]. For stack.pop method, the element of StackOfInteger 
   * which is size, will decrease. For stack.peek, the element of StackOfInteger
   * will be size minus 1. If stack.empty is true, size is 0. For 
   * stack.getsize, it will return size.
   */
  private int[] elements;
  private int size;

  /**  
   * Construct StackOfIntegers with capacity is 16
   */
  public StackOfIntegers() {
    this(16);
  }

  /** 
   * Construct StackOfIntegers, elements is the array that has 16 elements
   */
  public StackOfIntegers(int capacity) {
    elements = new int[capacity];
  }

  /** 
   * create value for the element of stack
   */
  public int push(int value) {
   // If size is bigger than 16
   if (size >= elements.length) {
     // Array temp will have its element of 32
      int[] temp = new int[elements.length * 2]; 
      // copy the element of array elements to the array temp
      System.arraycopy(elements, 0, temp, 0, elements.length);
      elements = temp;
    }

    return elements[size++] = value;
  }

  /** 
   * The element of StackOfInteger which is size, will decrease
   */
  public int pop() {
    return elements[--size];
  }

  /** 
   * The element of StackOfInteger will be size minus 1
   */
  public int peek() {
    return elements[size - 1];
  }

  /** 
   * Check whether the StackOfInteger is empty, then size is 0
   */
  public boolean empty() {
    return size == 0;
  }

  /**  
   * size, the element of StackOfInteger will return
   */
  public int getSize() {
    return size;
  }
}
