package view;
//import jdk.jshell.Snippet; //wat?
import model.Player;
import model.Schachbrett;
import akkgframework.view.DrawFrame;

import javax.swing.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StartpanelScreen extends JFrame {
    private JButton startButton;
    private JTextArea Player1Name;
    private JPanel Startpanel;
    private JTextArea Player2Name;
    private DrawFrame drawFrame;

    public StartpanelScreen(){
        add(Startpanel);
        setTitle("ChessMadnes");
        setSize(400,250);
        setVisible(false);
        setDefaultCloseOperation(0);
        setResizable(false);
        setAlwaysOnTop(true);
        setLocation(675,450);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                //HighscorePanel myGuiForm = new HighscorePanel();
                /*schachbrettPanel.player1Label.setText(Player1Name.getText());
                schachbrettPanel.player2Label.setText(Player2Name.getText());
                SchachbrettPanel schachbrettPanel = new SchachbrettPanel();*/
            }
        });

    }

    public String getPlayerName1(){
        return Player1Name.getText();
    }

    public String getPlayerName2(){
        return Player2Name.getText();
    }
}
