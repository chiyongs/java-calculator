import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame{
  private JTextField inputSpace;

  public static void main(String[] arg){
    new Calculator();
  }
  public Calculator() {
    setLayout(null);

    inputSpace = new JTextField();
    inputSpace.setEditable(false);
    inputSpace.setBackground(Color.WHITE);
    inputSpace.setHorizontalAlignment(JTextField.RIGHT);
    inputSpace.setFont(new Font("Arial",Font.BOLD,50));
    inputSpace.setBounds(8,10,270,70);

    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new GridLayout(4,4,10,10));
    buttonPanel.setBounds(8,90,270,235);

    String[] buttonNames = {"C","÷","x","=","7","8","9","+","4","5","6","-","1","2","3","0"};
    JButton[] buttons = new JButton[buttonNames.length];
    for(int i=0; i<buttonNames.length; i++){
      buttons[i] = new JButton(buttonNames[i]);
      buttons[i].setFont(new Font("Arial",Font.BOLD, 20));
      if(buttonNames[i].equals("C")) buttons[i].setBackground(Color.RED);
      else if((i>=4&&i<=6)||(i>=8&&i<=10)||(i>=12&&i<=14)) buttons[i].setBackground(Color.BLACK);
      else buttons[i].setBackground(Color.GRAY);
      buttons[i].setForeground(Color.WHITE);
      buttons[i].setBorderPainted(false);
      buttons[i].setOpaque(true);
      buttonPanel.add(buttons[i]);
    }
    add(inputSpace);
    add(buttonPanel);
    setTitle("Calculator");
    setVisible(true);
    setSize(290,370);
    setLocationRelativeTo(null);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

}
