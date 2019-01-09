package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class StartPanel {

    public StartPanel(MainView mainview){
            createButtons();
            this.mainView = mainView;
    }

    public JPanel getPanel(){
        return panel;
    }

    public createButtons(){

    }

    public void startGameClicked(){
        String name = textField1.getText();
        mainView.play(name);
    }
}
