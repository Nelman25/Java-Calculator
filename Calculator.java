import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener{

    JFrame frame;
    JTextField textField;
    JButton[] numbers = new JButton[10];
    JButton[] functions = new JButton[8];
    JButton addition,subtraction,multiplication,division;
    JButton decimal,delete,clear,equal;
    JPanel panel;

    Font defaultFont = new Font("Helvetica",Font.BOLD,30);
    double num1 = 0;
    double num2 = 0;
    char operator;

    Calculator() {
        frame = new JFrame("Calculator using Java");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,550);
        frame.setLayout(null);

        

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
