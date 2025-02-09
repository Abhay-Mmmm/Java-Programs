import javax.swing.*;
class Test extends JFrame{
    public static void main(String[] args) {
        String name=JOptionPane.showInputDialog("What's Your Name?");
        JOptionPane.showMessageDialog(null,"Hello! "+name);
        int age=Integer.parseInt(JOptionPane.showInputDialog("What's ur age"));
        JOptionPane.showMessageDialog(null,"Your Age is : "+age);
        double marks=Double.parseDouble(JOptionPane.showInputDialog("How much did you score (out of 10)"));
        JOptionPane.showMessageDialog(null,"Your Mark is : "+marks);
        JOptionPane.showMessageDialog(null,"Message!","DialogBoxName",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"FYI Hi!","DialogBoxName",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Error!","DialogBoxName",JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null,"Sure?","DialogBoxName",JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Warning!","DialogBoxName",JOptionPane.WARNING_MESSAGE);
        int ans = JOptionPane.showConfirmDialog(null, "Are you human?","Question",JOptionPane.YES_NO_CANCEL_OPTION);
        System.out.println(ans);
    }
}