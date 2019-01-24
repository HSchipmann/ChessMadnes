package view;

import akkgframework.control.fundamental.MainController;
import akkgframework.model.Display;
import akkgframework.view.DrawTool;
import model.Schachbrett;

import javax.swing.*;

public class SchachbrettPanel extends JFrame {
    private JPanel schachpanel1;
    private JLabel SchachbrettBG;
    public JLabel player1Label;
    public JLabel player2Label;
    private JPanel schachPanell;
    private Schachbrett schachbrett;

    public SchachbrettPanel() {
        add(schachpanel1);
        setTitle("ChessMadnes");
        setSize(900,900);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void drawTool(DrawTool drawTool){
        drawTool.drawImage(schachbrett.tileset.getTile(0,1),0,0);
    }
}
