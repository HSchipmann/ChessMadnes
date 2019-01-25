package control;
//Efi Efi Efi Efi Efi Efi

import akkgframework.control.fundamental.MainController;

import akkgframework.model.abitur.datenstrukturen.List;
import model.Score;
import model.Highscore;

import java.lang.reflect.Field;

public class HighscoreCon {

    public List<Score>[] allScores;

    public HighscoreCon(){
        allScores = new List[10];
        allScores[0] = new List<Score>();

    }

    public boolean sort(int index){
        List<Score> list = allScores[index];
        List<Score> sorted = new List<>();
        list.toFirst();
        sorted.append((list.getContent()));
        list.remove();

        while(!list.isEmpty()){
            list.toFirst();
            Score score = list.getContent();
            sorted.toFirst();
            //while(sorted.hasAcces() && sorted.getContent().getName().compareTo(score.getWin())) < 0){
          //      sorted.next();
          //  }
            if (sorted.hasAccess()) {
                sorted.insert(score);
            }else{
                sorted.append(score);
            }
            list.remove();
        }
        allScores[index] = sorted;
        return true;
    }
}
