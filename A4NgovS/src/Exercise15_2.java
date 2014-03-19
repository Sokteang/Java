/**
 *Exercise15.2
 *The program is created to develop a custom class that displays the button 
 *2 buttons "OK" and "Cancel", which is inside an oval.
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

import javax.swing.*;
import java.awt.*;
public class Exercise15_2 extends JFrame{
  /**
   * Firstly, we create 2 buttons named jbOK and jbCancel. Create an constructor
   * ,set the layout, and add the buttons into the frame. Inside the main 
   * method, create a frame, set the size, location, and title of the frame.
   * Create a custom class named OvalButton that extends to JButton. Integer the 
   * width and height. Draw the ovals. Lastly, set the size for the button.
   */
  
  //create two buttons
  private OvalButton jbOk = new OvalButton("OK");
  private OvalButton jbCancel = new OvalButton("Cancel");

  public Exercise15_2() {
    setLayout(new FlowLayout());
    add(jbOk);
    add(jbCancel);
  }
  public static void main(String[] args) {
    Exercise15_2 frame = new Exercise15_2();
    frame.setTitle("Exercise15_2");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 200);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setVisible(true);
  }
}
 
  class OvalButton extends JButton {
    public OvalButton(String text) {
      super(text);
    }
    protected void paintComponent(Graphics g) {
      // Draw an oval
      super.paintComponent(g);
      int width = getWidth();
      int height = getHeight();
      g.drawOval((int)(0.1 * width), (int)(0.1 * height),
      (int)(0.8 * width), (int)(0.8 * height));
    }
    //set the size of the buttons
    public Dimension getPreferredSize() {
      return new Dimension(120, 100);
    }
    public OvalButton() {
    }
  }
