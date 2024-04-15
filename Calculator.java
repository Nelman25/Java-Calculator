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

    Font defaultFont = new Font("Helvetica",Font.BOLD,25);
    double num1 = 0;
    double num2 = 0;
    char operator;

    Calculator() {
        frame = new JFrame("Calculator using Java");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,560);
        frame.getContentPane().setBackground(Color.black);
        frame.setLayout(null);

        textField = new JTextField();
        textField.setFont(defaultFont);
        textField.setBounds(0,0,405,100);
        textField.setBackground(Color.black);
        textField.setForeground(Color.white);
        textField.setEditable(true);

        addition = new JButton("+");
        subtraction = new JButton("-");
        multiplication = new JButton("*");
        division = new JButton("/");
        decimal = new JButton(".");
        equal = new JButton("=");
        clear = new JButton("Clear");
        delete = new JButton("Delete");

        functions[0] = addition;
        functions[1] = subtraction;
        functions[2] = multiplication;
        functions[3] = division;
        functions[4] = decimal;
        functions[5] = equal;
        functions[6] = clear;
        functions[7] = delete;

        for(int i = 0;i<8;i++) {
            functions[i].addActionListener(this);
            functions[i].setFont(defaultFont);
            functions[i].setFocusable(false);
            functions[i].setForeground(Color.orange);
            functions[i].setBorderPainted(false);
            functions[i].setContentAreaFilled(false);
            functions[i].setFocusPainted(false);
            functions[i].setOpaque(false);
        }

        for(int i = 0;i<10;i++) {
            numbers[i] = new JButton(String.valueOf(i));
            numbers[i].addActionListener(this);
            numbers[i].setFont(defaultFont);
            numbers[i].setFocusable(false);
            numbers[i].setForeground(Color.white);
            numbers[i].setBorderPainted(false);
            numbers[i].setContentAreaFilled(false);
            numbers[i].setFocusPainted(false);
            numbers[i].setOpaque(false);
        }

        delete.setBounds(50,430,145,50);
        clear.setBounds(205,430,145,50);

        panel = new JPanel();
        panel.setBounds(50,110,320,320);
        panel.setLayout(new GridLayout(4,4,5,5));
        panel.setBackground(Color.black);


        panel.add(numbers[1]);
        panel.add(numbers[2]);
        panel.add(numbers[3]);
        panel.add(addition);
        panel.add(numbers[4]);
        panel.add(numbers[5]);
        panel.add(numbers[6]);
        panel.add(subtraction);
        panel.add(numbers[7]);
        panel.add(numbers[8]);
        panel.add(numbers[9]);
        panel.add(multiplication);
        panel.add(decimal);
        panel.add(numbers[0]);
        panel.add(equal);
        panel.add(division);


        frame.add(panel);
        frame.add(clear);
        frame.add(delete);
        frame.add(textField);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
