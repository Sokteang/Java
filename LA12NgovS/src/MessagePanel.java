/**
 *Exercise17.1
 *The purpose of the program is to change the color of the message, and move 
 *the message to the left or right. Set a new message as "Welcome to Java".
 * 
 * @author Sokteang Ngov
 * <br>
 * Zaman University
 * <br><br>
 * Murat Tutumlu
 * <br>
 * CS 152 Introduction to Java Programming
 * June 14, 2012
 */

import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.FontMetrics;
public class MessagePanel extends JPanel { 
  /**
   * Create the message as "Welcome to Java". Set the coordinate of the message.
   * The interval for moving the message horizontally and vertically is 10.
   * Create the constructor. Set a new xCoordinator and yCoordinator. Get the 
   * position of the leftmost character in the baseline and draw the message
   * according to the coordinator. The xCoordinate will decrease when pressing 
   * the left button, and increase when pressing the right button. 
   */
  private String message = "Welcome to Java";
  
  /** The x-coordinate where the message is displayed */
  private int xCoordinate = 20;
  
  /** The y-coordinate where the message is displayed */
  private int yCoordinate = 20;
  
  /** Indicate whether the message is displayed in the center */
  private boolean centered;
  
  /** The interval for moving the message horizontally and vertically */
  private int interval = 10;
   
  public MessagePanel() {
  }
  
  /** Construct a message panel with a specified message */
  public MessagePanel(String message) {
    this.message = message;
  }
 
  /** Return message */
  public String getMessage() {
    return message;
  }
     
  /** Set a new message */
  public void setMessage(String message) {
    this.message = message;
    repaint();
  }
    
  /** Return xCoordinator */
  public int getXCoordinate() {
    return xCoordinate;
  }
     
  /** Set a new xCoordinator */
  public void setXCoordinate(int x) {
    this.xCoordinate = x;
    repaint();
  }
     
  /** Return yCoordinator */
  public int getYCoordinate() {
    return yCoordinate;
  }
    
  /** Set a new yCoordinator */
  public void setYCoordinate(int y) {
    this.yCoordinate = y;
    repaint();
  }
    
  /** Return centered */
  public boolean isCentered() {
    return centered;
  }
      
  /** Set a new centered */
  public void setCentered(boolean centered) {
    this.centered = centered;
    repaint();
  }
      
  /** Return interval */
  public int getInterval() {
    return interval;
  }
      
  /** Set a new interval */
  public void setInterval(int interval) {
    this.interval = interval;
    repaint();
  }
      
  /** Paint the message */
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    if (centered) {     
      FontMetrics fm = g.getFontMetrics();
      int stringWidth = fm.stringWidth(message);
      
      // Get the position of the leftmost character in the baseline
      xCoordinate = getWidth() / 2 - stringWidth / 2;
    } 
    g.drawString(message, xCoordinate, yCoordinate);
  }
      
  /** Move the message left */
  public void moveLeft() {
    xCoordinate -= interval;
    repaint();
  }
      
  /** Move the message right */
  public void moveRight() {
    xCoordinate += interval;
    repaint();
  }
}
