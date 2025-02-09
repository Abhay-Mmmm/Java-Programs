import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener{

    JFrame frame;
    JTextField textfield;
    JButton[] numberButtons = new JButton[10];
    JButton[] fButtons = new JButton[9];
    JButton addButton,subButton,mulButton,divButton;
    JButton deciButton,eqButton,delButton,clrButton,negButton;
    JPanel panel;

    double num1=0,num2=0,result=0;
    char oper;

    Calculator()
    {   
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,550);
        frame.setLayout(null);
        frame.setResizable(false);

        textfield = new JTextField();
        textfield.setBounds(50,25,300,50);
        textfield.setEditable(false);
        textfield.setFont(new Font("Aries",Font.PLAIN,30));

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        deciButton = new JButton(".");
        eqButton = new JButton("=");
        delButton = new JButton("Del");
        clrButton = new JButton("Clr");
        negButton = new JButton("(-)");
        fButtons[0]=addButton;
        fButtons[1]=subButton;
        fButtons[2]=mulButton;
        fButtons[3]=divButton;
        fButtons[4]=deciButton;
        fButtons[5]=eqButton;
        fButtons[6]=delButton;
        fButtons[7]=clrButton;
        fButtons[8]=negButton;
        for(int i=0;i<9;i++)
        {
            fButtons[i].addActionListener(this);
            fButtons[i].setFocusable(false);
            fButtons[i].setFont(new Font("Aries",Font.PLAIN,30));
        }

        delButton.setBounds(150, 430, 100, 50);
        clrButton.setBounds(250, 430, 100, 50);
        negButton.setBounds(50,430,100,50);

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4,4,10,10));
        
        for(int i=0;i<10;i++)
        {
            numberButtons[i]=new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFocusable(false);
            numberButtons[i].setFont(new Font("Aries",Font.BOLD,30));
        }

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(deciButton);
        panel.add(numberButtons[0]);
        panel.add(eqButton);
        panel.add(divButton);

        frame.add(delButton);
        frame.add(clrButton);
        frame.add(negButton);
        frame.add(panel);
        frame.add(textfield);
        frame.setVisible(true);
    }
    public static void main(String[] args) 
    {
        new Calculator();
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        for(int i=0;i<10;i++)
        {
            if(e.getSource()==numberButtons[i])
            {
                textfield.setText(textfield.getText().concat(String.valueOf(i)));
            }
        }
        if(e.getSource()==deciButton)
        {
            textfield.setText(textfield.getText().concat(String.valueOf(".")));
        }
        if(e.getSource()==addButton)
        {
            textfield.setText(textfield.getText());
            num1=Double.parseDouble(textfield.getText());
            oper='+';
            textfield.setText("");
        }
        if(e.getSource()==mulButton)
        {
            textfield.setText(textfield.getText());
            num1=Double.parseDouble(textfield.getText());
            oper='*';
            textfield.setText("");
        }
        if(e.getSource()==divButton)
        {
            textfield.setText(textfield.getText());
            num1=Double.parseDouble(textfield.getText());
            oper='/';
            textfield.setText("");
        }
        if(e.getSource()==subButton)
        {
            textfield.setText(textfield.getText());
            num1=Double.parseDouble(textfield.getText());
            oper='-';
            textfield.setText("");
        }
        if(e.getSource()==eqButton)
        {
            num2=Double.parseDouble(textfield.getText());
            switch (oper) {
                case '+':
                    result=num1+num2;
                    break;
                case '-':
                    result=num1-num2;
                    break;
                case '*':
                    result=num1*num2;
                    break;
                case '/':
                    result=num1/num2;
                    break;
                default:
                    break;
            }
            textfield.setText(String.valueOf(result));
            num1=result;
        }
        if(e.getSource()==clrButton)
        {
            textfield.setText("");
        }
        if(e.getSource()==delButton)
        {
            String string = textfield.getText();
            textfield.setText("");
            for(int i=0;i<string.length()-1;i++)
            {
                textfield.setText(textfield.getText()+string.charAt(i));
            }
        }
        if(e.getSource()==negButton)
        {
            Double temp = Double.parseDouble(textfield.getText());
            temp=temp*-1;
            textfield.setText(String.valueOf(temp));
        }
    }
}