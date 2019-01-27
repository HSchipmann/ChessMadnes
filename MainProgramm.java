

import akkgframework.control.fundamental.MainController;
import akkgframework.model.abitur.datenstrukturen.List;
import control.HighscoreCon;
import control.ReadFile;
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
        /*ReadFile rf = new ReadFile("src/assets/HighscoreFile.txt");
        Highscore wF = new Highscore("src/assets/HighscoreFile.txt");
        String filename = "src/assets/HighscoreFile.txt";
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
        /*wF data = new wF(filename,true);
        Highscore.writeToFile(""+);
        System.out.println("Score Written To");*/

    }
}
