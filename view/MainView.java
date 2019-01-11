package view;


import akkgframework.control.fundamental.MainController;

import javax.swing.*;

/**
 * Created by Jean-Pierre on 05.11.2016.
 */
public class MainView extends JFrame{

    public MainView(MainController controller){
        this.setBounds(50,50,1230,700);
        this.setTitle("Chess Madness");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setContentPane(new StartPanel(controller).getPanel());
        this.setVisible(true);
    }
}