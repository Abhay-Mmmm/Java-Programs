import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MouseEventEx extends JFrame implements MouseListener, MouseMotionListener {
    public JLabel label;

    public MouseEventEx() {
        setTitle("Mouse Events");
        setSize(400, 300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("Mouse Info:");
        add(label);

        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked at: (" + e.getX() + " , " + e.getY() + ")");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited at: (" + e.getX() + " , " + e.getY() + ")");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered at: (" + e.getX() + " , " + e.getY() + ")");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed at: (" + e.getX() + " , " + e.getY() + ")");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released at: (" + e.getX() + " , " + e.getY() + ")");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        label.setText("Mouse Dragged at: (" + e.getX() + " , " + e.getY() + ")");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        label.setText("Mouse Moved at: (" + e.getX() + " , " + e.getY() + ")");
    }

    public static void main(String args[]) {
        MouseEventEx obj = new MouseEventEx();
        obj.setVisible(true);
    }
}
