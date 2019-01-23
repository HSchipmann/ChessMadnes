package model;

public class Player {

    //Attribute
    private String myName;
    public int bewegungspunkte;

    //Referenzen

    //Methoden
    public Player(String name){
        myName = name;

    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }
}
