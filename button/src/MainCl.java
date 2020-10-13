import javax.swing.*;

import javax.swing.*;

public class MainCl {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(900, 600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //FootballForm footballForm = new FootballForm();
        frame.add(new MainFrame().getPanel1());
    }
}
