package model;

import akkgframework.control.fundamental.MainController;
import model.Highscore;
import view.MainView;
import view.StartpanelScreen;
import model.Rook;
import model.King;
import java.io.IOException;

public class MainProgramm {


// IOExpection is nötig, um Java zu sagen das ein IOExpection error vorkommen wird und es das lösen muss.
    //falls was schief läuft ist try...catch da, um eine passende error Naricht zu senden.
    public static void main(String[] args) throws IOException {
        new MainView(new MainController());
        /*String filename = "C:/test.txt";
        try {
            ReadFile file = new ReadFile(filename);
            String[] aryLines = file.OpenFile();
            int i;
            for (i = 0; i < aryLines.length; i++) {
                System.out.println(aryLines[i]);
            }
        }
        catch (IOException e){
            System.out.println("Nohing here, mate.");
        }
        WriteFile data = new WriteFile(filename,true);
        Highscore.writeToFile(""+);
        System.out.println("Score Written To");
        */
    }
}
