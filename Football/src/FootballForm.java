import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class FootballForm {
    private JPanel panelFoot;
    private JButton scoreAddT1;
    private JButton resultButton;
    private JButton scoreAddT2;
    private JLabel scores;
    private JLabel team1;
    private JLabel team2;
    private int numScoreTeam1 = 0;
    private int numScoreTeam2 = 0;

    public JPanel getPanelForm() {return panelFoot;}
    FootballForm()
    {
        resultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (numScoreTeam1 > numScoreTeam2)
                {
                    scores.setText("Победили технари");
                    scores.setForeground(Color.red);
                }
                else if (numScoreTeam2 > numScoreTeam1)
                {
                    scores.setText("Победили гуманитарии");
                    scores.setForeground(Color.green);
                }
                else
                {
                    scores.setText("Ничья");
                }
                scoreAddT1.setEnabled(false);
                scoreAddT2.setEnabled(false);
                resultButton.setEnabled(false);
            }
        });
        scoreAddT1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numScoreTeam1 += 1;
                scores.setText(String.valueOf(numScoreTeam1) + "\t X \t" + String.valueOf(numScoreTeam2));
            }
        });
        scoreAddT2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numScoreTeam2 += 1;
                scores.setText(String.valueOf(numScoreTeam1) + "\t X \t" + String.valueOf(numScoreTeam2));
            }
        });
        panelFoot.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                scores.setText(String.valueOf(numScoreTeam1) + "\t X \t" + String.valueOf(numScoreTeam2));
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }
}
