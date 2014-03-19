/**
 * Exercise5.28 page 194
 * The program will let user to write
 * in the form for some positive integer p (p<= 31)
 * 
 * Sokteang Ngov
 * <br>
 * Zaman University
 * <br><br>
 * Murat Tutumlu
 * <br>
 * CS 152 Introduction to Java Programming
 * March 27, 2012
 */

public class Exercise5_28 {

	/**
	 * @param args
	 */
  public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("p" + "\t" + "2^p -1");
    int num = 0;
    for (int p = 1; p <= 31; p++) {
	
	  for (num = 2; num <= p; num++) {
	    if (p % num == 0) {
	    	break;
        }
	  }
	    if (p == num) {
	    int	result = 0;
	    	  result = (int) Math.pow(2, p) - 1;
		      System.out.println(p + "\t" + result);      
	    }
    }
  }  
}



	
