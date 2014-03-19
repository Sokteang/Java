import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Calculator extends JFrame {

  private JPanel contentPane;
  private JTextField textField;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Calculator frame = new Calculator();
          frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the frame.
   */
  public Calculator() {
    setTitle("Calulator");
    setBackground(Color.YELLOW);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 344, 247);
    contentPane = new JPanel();
    contentPane.setBackground(Color.PINK);
    contentPane.setForeground(Color.PINK);
    contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.ORANGE));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    textField = new JTextField();
    textField.setBounds(24, 11, 287, 34);
    contentPane.add(textField);
    textField.setColumns(10);
    
    JButton button = new JButton("4");
    button.setBounds(24, 103, 42, 23);
    contentPane.add(button);
    
    JButton button_1 = new JButton("7");
    button_1.setBounds(24, 137, 42, 23);
    contentPane.add(button_1);
    
    JButton button_2 = new JButton(".");
    button_2.setBounds(24, 172, 42, 23);
    contentPane.add(button_2);
    
    JButton button_3 = new JButton("2");
    button_3.setBounds(84, 70, 42, 23);
    contentPane.add(button_3);
    
    JButton button_4 = new JButton("5");
    button_4.setBounds(84, 103, 42, 23);
    contentPane.add(button_4);
    
    JButton button_5 = new JButton("8");
    button_5.setBounds(84, 137, 42, 23);
    contentPane.add(button_5);
    
    JButton button_6 = new JButton("0");
    button_6.setBounds(84, 172, 42, 23);
    contentPane.add(button_6);
    
    JButton button_7 = new JButton("3");
    button_7.setBounds(147, 70, 42, 23);
    contentPane.add(button_7);
    
    JButton button_8 = new JButton("6");
    button_8.setBounds(147, 103, 42, 23);
    contentPane.add(button_8);
    
    JButton button_9 = new JButton("9");
    button_9.setBounds(147, 137, 42, 23);
    contentPane.add(button_9);
    
    JButton button_10 = new JButton("=");
    button_10.setBounds(147, 172, 42, 23);
    contentPane.add(button_10);
    
    JButton button_11 = new JButton("+");
    button_11.setBounds(243, 89, 42, 23);
    contentPane.add(button_11);
    
    JButton button_12 = new JButton("*");
    button_12.setBounds(216, 123, 42, 23);
    contentPane.add(button_12);
    
    JButton button_13 = new JButton("/");
    button_13.setBounds(269, 123, 42, 23);
    contentPane.add(button_13);
    
    JButton button_14 = new JButton("-");
    button_14.setBounds(243, 157, 42, 23);
    contentPane.add(button_14);
    
    JButton button_15 = new JButton("1");
    button_15.setBounds(24, 69, 42, 23);
    contentPane.add(button_15);
  }
}
