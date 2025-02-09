import javax.swing.*;
import java.awt.event.*;
public class Main{
    public static void  main(String[] args) {
        new MyFrame();
    }
}

class MyFrame extends JFrame implements ActionListener{
    JButton button;
    MyFrame()
    {
        button=new JButton();
        button.setBounds(90,150, 200, 50);
        button.addActionListener(this);
        button.setText("Yamete, Press Me!");
        button.setHorizontalAlignment(JButton.CENTER);
        button.setVerticalAlignment(JButton.CENTER);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Just a FRAME");
        this.setSize(400,400);
        this.setVisible(true);
        this.setLayout(null);
        this.add(button);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button)
        {System.out.println("I'm pressed!!");}
    }
}