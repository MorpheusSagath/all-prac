import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame {
    private JButton buttonBig;
    private JPanel panel1;
    private JPanel drawPanel;

    JPanel getPanel1()
    {
        return panel1;
    }

    MainFrame()
    {
        buttonBig.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Graphics2D graphics2D = (Graphics2D) drawPanel.getGraphics();
                graphics2D.setColor(Color.red);
                graphics2D.drawRect(10, 10, 50, 50);
            }
        });
    }
}
