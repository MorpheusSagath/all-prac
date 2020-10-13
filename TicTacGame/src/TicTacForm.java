import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TicTacForm {
    private JPanel mainJP;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JPanel JPanel;
    boolean haveWinner = false;
    private JButton startButton;
    private JPanel topLine;
    int xPos[] = {350, 440, 530};
    int yPos[] = {60, 150, 240};
    int pos[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    JButton[] buttons = {button1, button2, button3, button4, button5,
            button6, button7, button8, button9};
    public JPanel getMainJP()
    {
        return mainJP;
    }
    public void checking()
    {
        Graphics2D graphics2D = (Graphics2D) topLine.getGraphics();
        graphics2D.setColor(Color.pink);
        for (int i = 0; i < 9; i+=3)
        {
            if (pos[i] == pos[i + 1] && pos[i + 2] == pos[i] && pos[i] != 0 && pos[i] < 3)
            {
                graphics2D.drawLine(xPos[i%3] - 25, yPos[i/3], xPos[i%3+2] + 25, yPos[i/3]);
                for (int k = 0; k < 9; k++)
                {
                    if (buttons[k].isEnabled() == true)
                    {
                        buttons[k].setEnabled(false);
                    }
                    pos[k] = 3;
                    haveWinner = true;
                }
                break;
            }
            else if (pos[0 + i/3] == pos[3 + i/3] && pos[0 + i/3] == pos[6 + i/3] && pos[0 + i/3] != 0 && pos[i] < 3)
            {
                graphics2D.drawLine(xPos[0 + i/3], yPos[0] - 25, xPos[0+i/3], yPos[2] + 25);
                for (int k = 0; k < 9; k++)
                {
                    if (buttons[k].isEnabled() == true)
                    {
                        buttons[k].setEnabled(false);
                    }
                    pos[k] = 3;
                    haveWinner = true;
                }
                break;
            }
            else if (pos[0] == pos[4] && pos[0] == pos[8] && pos[0] != 0 && pos[i] < 3)
            {
                graphics2D.drawLine(xPos[0] - 25, yPos[0] - 25, xPos[2]+25, yPos[2]+25);
                for (int k = 0; k < 9; k++)
                {
                    if (buttons[k].isEnabled() == true)
                    {
                        buttons[k].setEnabled(false);
                    }
                    pos[k] = 3;
                    haveWinner = true;
                }
                break;
            }
            else if (pos[2] == pos[4] && pos[2] == pos[6] && pos[2] != 0 && pos[i] < 3)
            {
                graphics2D.drawLine(xPos[2] + 25, yPos[0] - 25, xPos[0] - 25, yPos[2]+25);
                for (int k = 0; k < 9; k++)
                {
                    if (buttons[k].isEnabled() == true)
                    {
                        buttons[k].setEnabled(false);
                    }
                    pos[k] = 3;
                    haveWinner = true;
                }
                break;
            }
            else
            {
                int numNull = 0;
                for (int j = 0; j < 9; j++)
                {
                    if (pos[j] == 0)
                    {
                        numNull += 1;
                    }
                }
                if (numNull == 0)
                {
                    haveWinner = true;
                }
            }
        }
        if (haveWinner == true)
        {
            startButton.setEnabled(true);
            startButton.setText("Restart");
        }
    }
    public void drawField()
    {
        Graphics2D graphics2D = (Graphics2D) topLine.getGraphics();
        graphics2D.setColor(Color.black);
        graphics2D.drawLine(310, 100, 570, 100);
        graphics2D.drawLine(310, 200, 570, 200);
        graphics2D.drawLine(390, 20, 390, 280);
        graphics2D.drawLine(490, 20, 490, 280);
    }
    public void drawX(int numPos)
    {
        Graphics2D graphics2D = (Graphics2D) topLine.getGraphics();
        graphics2D.setColor(Color.black);
        graphics2D.drawLine(xPos[numPos%3]-25, yPos[numPos/3]-25,
                xPos[numPos%3]+25, yPos[numPos/3]+25);
        graphics2D.drawLine(xPos[numPos%3]+25, yPos[numPos/3]-25,
                xPos[numPos%3]-25, yPos[numPos/3]+25);
        buttons[numPos].setEnabled(false);
        pos[numPos] = 1;
    }
    public void compTurn()
    {
        final Random random = new Random();
        while (true && haveWinner == false)
        {
            int randResult = random.nextInt(9);
            if (pos[randResult] == 0)
            {
                drawO(randResult);
                break;
            }
        }
        checking();
    }
    public void drawO(int numPos)
    {
        Graphics2D graphics2D = (Graphics2D) topLine.getGraphics();
        graphics2D.setColor(Color.black);
        graphics2D.drawOval( xPos[numPos%3]-25, yPos[numPos/3]-25, 50, 50);
        buttons[numPos].setEnabled(false);
        pos[numPos] = 2;
    }
    TicTacForm()
    {
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < 9; i++)
                {
                    Graphics2D graphics2D = (Graphics2D) topLine.getGraphics();
                    haveWinner = false;
                    graphics2D.setColor(new Color(238, 239, 239));
                    graphics2D.drawOval( xPos[i%3]-25, yPos[i/3]-25, 50, 50);
                    //buttons[i].setEnabled(false);
                    pos[i] = 0;
                    graphics2D.drawLine(xPos[i%3]-25, yPos[i/3]-25,
                            xPos[i%3]+25, yPos[i/3]+25);
                    graphics2D.drawLine(xPos[i%3]+25, yPos[i/3]-25,
                            xPos[i%3]-25, yPos[i/3]+25);
                    graphics2D.drawLine(xPos[2] + 25, yPos[0] - 25,
                            xPos[0] - 25, yPos[2]+25);
                    graphics2D.drawLine(xPos[0] - 25, yPos[0] - 25,
                            xPos[2]+25, yPos[2]+25);
                    for (int jn = 0; jn < 9; jn+=3)
                    {
                        graphics2D.drawLine(xPos[0 + jn/3], yPos[0] - 25, xPos[0+jn/3], yPos[2] + 25);
                        graphics2D.drawLine(xPos[jn%3] - 25, yPos[jn/3], xPos[jn%3+2] + 25, yPos[jn/3]);
                    }
                }
                drawField();
                final Random random = new Random();
                for (int k = 0; k < 9; k++)
                {
                    buttons[k].setEnabled(true);
                }
                int ran = random.nextInt(9000000);
                if (ran%2 == 0)
                {
                    compTurn();
                }

                startButton.setEnabled(false);
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawX(0);
                checking();
                compTurn();
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawX(1);
                checking();
                compTurn();
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawX(2);
                checking();
                compTurn();
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawX(3);
                checking();
                compTurn();
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawX(4);
                checking();
                compTurn();
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawX(5);
                checking();
                compTurn();
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawX(6);
                checking();
                compTurn();
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawX(7);
                checking();
                compTurn();
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawX(8);
                checking();
                compTurn();
            }
        });
    }
}