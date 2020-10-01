import javax.swing.*;

public class MainCl {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        MyForm myForm = new MyForm();
        frame.add(myForm.getPanelForm());
        //frame.add(new JButton("Click"));
    }
}
