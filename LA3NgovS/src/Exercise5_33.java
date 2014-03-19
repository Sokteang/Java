/**
 * Exercise5.33
 * The program will show the current and full date with day, month, and year ,and time. 
 * 
 * @author Sokteang Ngov
 * <br>
 * Zaman University
 * <br><br>
 * Murat Tutumlu
 * <br>
 * CS 152 Introduction to Java Programming
 * @since March 27, 2012
 */

public class Exercise5_33 {
	/**
	 *So, to display the current date and time, first the second is the milli 
	 *second muliply by 10^(-3), and when we divide the second by 60, we will get
	 *minute, and the reminder will be current second. The current minute will be
	 *the remain of minute divided by 60, and we do the same thing to find 
	 *current hour. Hours divides by 24 is the value of the day, but we need to 
	 *add 1, because 1 is the current day.The computer will count the year from 
	 *1970, define isLeapYear(int year) is the boolean. With that formula, we 
	 *will find the year, if the day is bigger or equal to isLeapYear(year) 
	 *(366 or 365), day will equal to day minus 366 or 365 until it is smaller 
	 *than isLeapYear(year). And it does the same thing to find month. Last, for
	 * the number of the day, if month is 1,3,5,8,10,12, it will return 31. 
	 * if month is 4,6,7,8,11, it will return 30. For month is 2, it will return 
	 * 29.
	 */
  public static void main(String[] args) {
	  // TODO Auto-generated method stub
    long seconds = System.currentTimeMillis() / 1000;
    long currentSecond = seconds % 60;
    long minutes = seconds / 60;
    long currentMinute = minutes % 60;
    long hours = minutes / 60; 
    long currentHour = hours % 24;
    long days = hours / 24 + 1; // 1 is to cover the current day
	    
    // Get year
    int year = 1970;
    while (days >= (isLeapYear(year) ? 366 : 365)) {
      days = days - (isLeapYear(year) ? 366 : 365);
      year++;      
	  }
	    
    // get month   
    int month = 1;
    while (days >= getNumberOfDaysInMonth(year, month)) {
      days = days - getNumberOfDaysInMonth(year, month);     
      month++;
    }
	    
    System.out.println("Current date and time is " 
      + getMonthName(month) + " " + days + ", " + year + " "
      + currentHour + ":" + currentMinute + ":" + currentSecond);
  }
	  
	  /** Get the English name for the month */
	  public static String getMonthName(int month) {
	    String monthName = null;
	    switch (month) {
	      case 1: monthName = "January"; break;
	      case 2: monthName = "February"; break;
	      case 3: monthName = "March"; break;
	      case 4: monthName = "April"; break;
	      case 5: monthName = "May"; break;
	      case 6: monthName = "June"; break;
	      case 7: monthName = "July"; break;
	      case 8: monthName = "August"; break;
	      case 9: monthName = "September"; break;
	      case 10: monthName = "October"; break;
	      case 11: monthName = "November"; break;
	      case 12: monthName = "December";
	    }
	
	    return monthName;
	  }
	
	  /** Get the number of days in a month */
	  public static int getNumberOfDaysInMonth(int year, int month) {
	    if (month == 1 || month == 3 || month == 5 || month == 7 ||
	      month == 8 || month == 10 || month == 12)
	      return 31;
	  
	    if (month == 4 || month == 6 || month == 9 || month == 11)
	      return 30;
	
	    if (month == 2) return isLeapYear(year) ? 29 : 28;
	
	      return 0; // If month is incorrect
	  }
	
	  /** Determine if it is a leap year */
	  public static boolean isLeapYear(int year) {
	    return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	
	}

}
