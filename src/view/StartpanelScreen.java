package view;

import model.Player;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

//efi Efi >Eif Efi efio
public class StartpanelScreen extends JFrame {
    private JButton startButton;
    private JTextArea Player1Name;
    private JPanel Startpanel;
    private JTextArea Player2Name;

    public StartpanelScreen(){
        add(Startpanel);
        setTitle("ChessMadnes");
        setSize(900,900);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//f

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
                //player1Label.setText(Player1Name.getText());
                //player2Label.setText(Player2Name.getText());
            }
        });
    }
}
