import java.awt.Color;
import javax.swing.*;
class MyFrame extends JFrame{
    MyFrame() {
        this.setVisible(true);
        this.setSize(400,400);
        this.setTitle("Just a this!");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Can use DO_NOTHING_ON_CLOSE to prevent closing when we press X on the this
        this.setResizable(false); // Now we can't resize the this!
        this.getContentPane().setBackground(Color.black); // Set the color of the background of the this!
    }
    public static void main(String[] args) {
        new MyFrame();
    }
}