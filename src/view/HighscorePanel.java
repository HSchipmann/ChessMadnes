package view;
import akkgframework.view.DrawFrame;
import control.ReadFile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HighscorePanel extends JFrame {
    private JPanel HighscorePanel;
    private JLabel HighscoreLabel;

    public HighscorePanel () {
        add(HighscorePanel);
        setTitle("ChessMadnes");
        setSize(80,740);
        setVisible(true);
        setDefaultCloseOperation(0);
        setResizable(false);
        setAlwaysOnTop(true);
        setLocation(1150,30);
        HighscoreLabel.setText(ReadFile.readLines());
    }
}
