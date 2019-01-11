package model;

public class Zugberechnung {

    private int bewegungspunkte;
    private boolean koenigMoved;
    private int[][] Schachbrett;
    private int koenigX;
    private int koenigY;

    public Zugberechnung(){
        bewegungspunkte = 3;
        koenigX = 1;
        koenigY = 1;
        Schachbrett = new int[5][5];
    }
    public contenttype<List> runAndAppend(){
        if (bewegungspunkte > 0 && koenigMoved){
            if(Schachbrett[koenigY][koenigX] != Schachbrett[koenigX][5]) {
                if(Schachbrett[koenigX][koenigY+1] == 0){
                    list.append("K+1");
                }
            }
        }
    }
}
