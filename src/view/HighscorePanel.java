package view;
import akkgframework.view.DrawFrame;
import control.ReadFile;
import model.Highscore;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.nio.file.Path;

public class HighscorePanel extends JFrame {
    private JPanel highscorePanel;
    private JLabel highscoreLabel;

    public HighscorePanel () {
        add(highscorePanel);
        setTitle("ChessMadnes");
        setSize(80,740);
        setVisible(true);
        setDefaultCloseOperation(0);
        setResizable(false);
        setAlwaysOnTop(true);
        setLocation(1150,30);
        //ReadFile rF = new ReadFile("src/assets/HighscoreFile.txt");
        highscoreLabel.setText("");
    }
}
