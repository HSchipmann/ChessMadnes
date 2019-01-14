package model;

import control.Highscore;

public class Score {
    private String name;
    private String wins;

    public Score( String name, String wins){
        this.name = name;
        this.wins = wins;
    }

    public String getName(){
        name = Highscore.getWinnerName(name);
        return name;
    }

    public String getWin(){
        return wins;
    }

    public void setWin(String wins){
        this.wins = wins;
    }
}
