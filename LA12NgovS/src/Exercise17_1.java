/**
 *Exercise17.1
 *The purpose of the program is to change the color of the message, and move 
 *the message to the left or right.
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

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.*;
 
public class Exercise17_1 extends JFrame {
  /**
   * First of all, we create the message panel, the left and right buttons, and 
   * the radio buttons. create the frame and set size, location, title, and 
   * make it visible. Create a constructor, and set the background of the 
   * message. Put the buttons into the frame. Set the tip text for the left and 
   * right buttons. Set the location of the buttons as south and message as 
   * center. Put the action for the left/right button to move left/right. 
   * Create the panel for radio buttons and group them. put the action for
   * each radio buttons when pressed. Set the initial color of the message as 
   * red.
   */
  //Create a panel for displaying message
  protected MessagePanel messagePanel = new MessagePanel();
  
  //Declare two buttons to move the message left and right
  private JButton jbtLeft = new JButton("<=");
  private JButton jbtRight = new JButton("=>");
  
  //declare radio buttons
  private JRadioButton jrbRed, jrbYellow, jrbWhite, jrbGray, jrbGreen;
  
  //create the frame 
  public static void main(String[] args) {
    Exercise17_1 frame = new Exercise17_1(); 
    frame.setTitle("Exercise17.1");
    frame.setSize(500, 200);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);  
  }
  
  public Exercise17_1() {
    //set the background color of messagePanel
    messagePanel.setBackground(Color.white);
    JPanel jpButtons = new JPanel();
    jpButtons.add(jbtLeft);
    jpButtons.add(jbtRight);
    
    //set the tip text on the buttons
    jbtLeft.setToolTipText("Move message to left");
    jbtRight.setToolTipText("Move message to right");
    
    //place the panel, buttons on the frame
    setLayout(new BorderLayout());
    add(messagePanel, BorderLayout.CENTER);
    add(jpButtons, BorderLayout.SOUTH);
    
    //put the action for the left button to move left
    jbtLeft.addActionListener(new ActionListener() {  
      public void actionPerformed(ActionEvent e) {
        messagePanel.moveLeft();
      }
    });
    
    //put the action for the right button to move right
    jbtRight.addActionListener(new ActionListener() {  
      public void actionPerformed(ActionEvent e) {
        messagePanel.moveRight();
      }
    });
    //create the panel for radio buttons
    JPanel jpRadioButtons = new JPanel();
    jpRadioButtons.setLayout(new GridLayout(1, 1));
    jpRadioButtons.add(jrbRed = new JRadioButton("Red"));
    jpRadioButtons.add(jrbYellow = new JRadioButton("Yellow"));
    jpRadioButtons.add(jrbWhite = new JRadioButton("White"));
    jpRadioButtons.add(jrbGray = new JRadioButton("Gray"));
    jpRadioButtons.add(jrbGreen = new JRadioButton("Green"));
   
    add(jpRadioButtons, BorderLayout.NORTH);
    //group the radio buttons
    ButtonGroup group = new ButtonGroup();
    group.add(jrbRed);
    group.add(jrbGreen);
    group.add(jrbYellow);
    group.add(jrbGray);
    group.add(jrbWhite);
    
    /*
     * put the action for each radio buttons when pressed
     */
    jrbRed.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        messagePanel.setForeground(Color.red); 
      }
    });
    jrbYellow.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        messagePanel.setForeground(Color.yellow); 
      }
    });
    jrbWhite.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        messagePanel.setForeground(Color.white); 
      }
    });
    jrbGray.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        messagePanel.setForeground(Color.gray); 
      }
    });
    jrbGreen.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        messagePanel.setForeground(Color.green); 
      }
    });
    //set the initial colour of the message as red
    jrbRed.setSelected(true);
    messagePanel.setForeground(Color.red);
  }
}

