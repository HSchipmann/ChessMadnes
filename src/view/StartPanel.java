package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class StartPanel {

    public StartPanel(MainView mainview) {
        StartpanelScreen startpanelScreen = new StartpanelScreen();
        startpanelScreen.pack();
        startpanelScreen.setVisible(true);

    }


    public void startGameClicked(){
        String name = textField1.getText();
        mainView.play(name);
    }
}
