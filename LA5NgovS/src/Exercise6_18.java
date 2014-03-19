/**
 * Exercise6.18
 * This program will show us the original list before sort, and the new list 
 * after sort, whose numbers are in order from the smallest to the biggest 
 * ones.
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

// Bubble sort
public class Exercise6_18 {
 /**
  * First of all, this program will produce 2 lists. One is the original list
  * and another one is the list with order from the smallest to the biggest 
  * numbers. For the original list is that we define i = 0, and it will loop
  * while i is smaller than the length of array ( print out the element of the
  * array. The second list is called Bubble Sort. First, we define j = 0, and 
  * j will increase one by one. If the first element of the array is bigger 
  * than the second element of the array, the second element will take the 
  * first element's place and the first element will fall to the last element.
  * This repeat until the number is in order from the smallest to the biggest 
  * numbers. Then it print out the result.
 */
  public static void main (String[] args) {
    double[] myList = {5.0, 4.4, 1.9, 2.9, 3.4, 2.9, 3.5};
    System.out.println("My list before sort is: ");
    //prints the original list
    printList(myList);
    bubbleSort(myList);
    //prints the sorted list
    System.out.println("My list after sort is: ");
    printList(myList);
  }
  // it is a method to print out the original array
  static void printList(double[] list) {
    for (int i = 0; i < list.length; i++)
      System.out.println(list[i]);
  }
  // it is a method to print out the bubble list which will find the ordered  
  // numbers from the smallest to the biggest numbers
  static void bubbleSort(double[] list) {
    boolean changed = true;
    do {
      changed = false;
      for (int j = 0; j < list.length - 1; j++)
        if (list[j] > list[j+1]) {
          //swap list[j] with list[j+1]
          double temp = list[j];
          list[j] = list[j + 1];
          list[j + 1] = temp;
          changed = true;
        }
    } 
    while (changed);
  }
}
