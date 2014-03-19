/**
 * Exercise10.10
 * This program is guess the user birthday using five two-dimensional arrays
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

public class GuessDate {
  /**
   * There will be 5 set to test for the real birthday date. Each set will has
   * 2 dimension arrays. set1, set2, set3, set4, and set5 will have the 
   * elements as below and the arrays are private, which can be used for only 
   * this class. To make the number in each set appears, we use switch method. 
   * When i = 0, array set1 will appear. When i = 1, array set2 will appear,
   * and continue till i is 4 when set5 appears, and then finish the switch.
   */
  
  // the element for array set1 
  private static int[][] set1 = 
    {{ 1,  3,  5,  7},
     { 9, 11, 13, 15},
     {17, 19, 21, 23},
     {25, 27, 29, 31}};

  // the element for array set2
  private static int[][] set2 =
    {{ 2,  3,  6,  7},
     {10, 11, 14, 15},
     {18, 19, 22, 23},
     {26, 27, 30, 31}};

  // the element for array set3
  private static int[][] set3 =
    {{ 4,  5,  6,  7},
     {12, 13, 14, 15},
     {20, 21, 22, 23},
     {28, 29, 30, 31}};

  // the element for array set4
  private static int[][] set4 =
    {{ 8,  9, 10, 11},
     {12, 13, 14, 15},
     {24, 25, 26, 27},
     {28, 29, 30, 31}};

  // the element for array set5
  private static int[][] set5 =
    {{16, 17, 18, 19},
     {20, 21, 22, 23},
     {24, 25, 26, 27},
     {28, 29, 30, 31}};

  // the method used to print each set on the screen
  public static int getValue(int setNo, int k, int j) {
    switch (setNo) {
      case 0: return set1[k][j];
      case 1: return set2[k][j];
      case 2: return set3[k][j];
      case 3: return set4[k][j];
      case 4: return set5[k][j];
    }
    return 0;
  }
}
