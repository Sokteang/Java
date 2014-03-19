/**
 *Exercise6.1
 *This program designs to give the grade to students after they write down the 
 *numbers of students and the scores for each students.
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

public class Exercise6_1 {
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    java.util.Scanner input = new java.util.Scanner(System.in);  
    System.out.println("Enter the number of the students:");
    final int NUMBER_OF_THE_STUDENTS = input.nextInt();
    int[] scores = new int[NUMBER_OF_THE_STUDENTS];
    System.out.println("Enter " + scores.length + " scores:");
    int max = scores[0];
    // put the scores from the users into the memory
    for (int i = 0; i < NUMBER_OF_THE_STUDENTS; i++) {  
      scores[i] = input.nextInt();   
    }
    // find the maximum score
    for (int i = 0; i < NUMBER_OF_THE_STUDENTS; i++) {  
      if (scores[i] > max)   
        max = scores[i];
    }
    for (int i = 0; i < scores.length; i++) {
      System.out.println("Student " + i + " score is " + scores[i] + 
          " and grade is " + grades(max, scores[i]));
    }
  }
  // the method to solve for grade
  public static char grades(int max, int score) {
    // define grade as character
    char grade = 'F';  
    if (score > (max - 10))
      grade = 'A';
    else if (score > (max - 20))
      grade = 'B';
    else if (score > (max - 30))
      grade = 'C';
    else if (score > (max - 40))
      grade = 'D';
    else 
      grade = 'F';
    return grade;
  }
}

