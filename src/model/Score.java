package model;

public class Score {
    private String name;
    private String wins;

    public Score( String name, String wins){
        this.name = name;
        this.wins = wins;
    }

<<<<<<< Updated upstream
    public String getName(){
=======
    public String getName() {
>>>>>>> Stashed changes
        return name;
    }

    public String getWins(){
        return wins;
    }

    public void setWins(String wins){
        this.wins = wins;
    }
}
