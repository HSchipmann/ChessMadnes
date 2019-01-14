package model;

public class Score {
    private String name;
    private String wins;

    public Score( String name, String wins){
        this.name = name;
        this.wins = wins;
    }

    public String getName(){
        return name;
    }

    public String getWins(){
        return wins;
    }

    public void setWins(String wins){
        this.wins = wins;
    }
}
