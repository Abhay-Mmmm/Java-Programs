import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DivisionCalculator extends JFrame {
    private JTextField numeratorField;
    private JTextField denominatorField;
    private JButton divideButton;

    public DivisionCalculator() {
        setTitle("Division Calculator");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        // Labels and text fields for numerator and denominator
        add(new JLabel("Numerator:"));
        numeratorField = new JTextField();
        add(numeratorField);

        add(new JLabel("Denominator:"));
        denominatorField = new JTextField();
        add(denominatorField);

        // Button to perform division
        divideButton = new JButton("Divide");
        add(divideButton);

        // Button click event
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Parse the inputs
                    double numerator = Double.parseDouble(numeratorField.getText());
                    double denominator = Double.parseDouble(denominatorField.getText());

                    // Check for division by zero
                    if (denominator == 0) {
                        JOptionPane.showMessageDialog(DivisionCalculator.this,
                                "Division by zero is not possible", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        // Perform division and show the result
                        double result = numerator / denominator;
                        JOptionPane.showMessageDialog(DivisionCalculator.this,
                                "Result: " + result, "Division Result", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (NumberFormatException ex) {
                    // Handle invalid input
                    JOptionPane.showMessageDialog(DivisionCalculator.this,
                            "Invalid input. Please enter numeric values.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        // Run the calculator GUI
        DivisionCalculator calculator = new DivisionCalculator();
        calculator.setVisible(true);
    }
}
