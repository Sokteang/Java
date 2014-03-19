/**
 *Exercise16.6
 *The purpose of the program is to rotate with a mouse click two messages 
 *displayed on a panel, “Java is fun” and “Java is powerful”.
 * 
 * @author Sokteang Ngov
 * <br>
 * Zaman University
 * <br><br>
 * Murat Tutumlu
 * <br>
 * CS 152 Introduction to Java Programming
 * June 16, 2012
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercise16_6 extends JFrame {
  /**
   * firstly, we create constructor which have a panel, set its layout, and add 
   * it to the frame. The frame title is Exercise16.6. The panel will be 
   * extended to MessagePanel class. Create 2 messages ("Java is fun" and "Java
   * is powerful"). We also have a listener when the mouse is clicked. Boolean
   * is true. If it is message is true, it will appear "Java is fun", else it
   * will appear "Java is powerful". The message will change when users click 
   * the mouse.
   */
  public Exercise16_6() {
    MPanel p = new MPanel();
    setLayout(new BorderLayout());
    add(p);  
  }

  public static void main(String[] args) {
    Exercise16_6 frame = new Exercise16_6();
    frame.setTitle("Exercise16.6");
    frame.setSize(250, 100);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
  static class MPanel extends MessagePanel {
    private String message1 = "Java is fun";
    private String message2 = "Java is powerful";
    private boolean message;
    public MPanel() {
      addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
          if (message) {
            setMessage(message1);
          }
          else {
            setMessage(message2);
          }  
          message = !message;
        }
      });
    }   
  }  
}

