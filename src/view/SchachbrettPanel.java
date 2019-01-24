package view;

import akkgframework.control.fundamental.MainController;
import akkgframework.control.fundamental.UIController;
import akkgframework.model.Display;
import akkgframework.view.DrawTool;
import akkgframework.view.DrawableObject;
import akkgframework.view.DrawingPanel;
import model.Schachbrett;
import akkgframework.view.DrawFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class SchachbrettPanel extends DrawingPanel {
    private JPanel schachpanel1;
    public JLabel player1Label;
    public JLabel player2Label;
    private JPanel schachPanell;
    private Schachbrett schachbrett;
    private BufferedImage image;

    public SchachbrettPanel() {
        add(schachPanell);
        //setTitle("ChessMadnes");
        setSize(900,900);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
