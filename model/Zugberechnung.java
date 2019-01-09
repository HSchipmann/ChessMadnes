package model;

public class Zugberechnung {
    private int bewegungspunkte;
    private boolean koenigMoved;

    private int[][] Schachbrett;
    private int koenigX;
    private int koenigY;
    private int turmX;
    private int turmY;

    public Zugberechnung(int pbewegungsPunkte){
        bewegungspunkte = pbewegungsPunkte;
        koenigX = 1;
        koenigY = 1;
        Schachbrett = new int[5][5];

        koenigMoved = false;
    }
    public boolean[][] run(){
        boolean[][] output;
        output = new boolean [1][7];

        if (bewegungspunkte > 0){
            if(!koenigMoved) {
                //koenig hoch runter links rechts
                //koenig
                if (Schachbrett[koenigX][koenigY] != Schachbrett[koenigX][5]) {
                    if (Schachbrett[koenigX][koenigY + 1] == 0) {
                        //koenigY = koenigY + 1;
                        output[0][0] = true;
                    }
                }
                //koenig
                if (Schachbrett[koenigX][koenigY] != Schachbrett[koenigX][0]) {
                    if (Schachbrett[koenigX][koenigY - 1] == 0) {
                        //koenigY = koenigY - 1;
                        output[0][1] = true;
                    }
                }
                //koenig
                if (Schachbrett[koenigX][koenigY] != Schachbrett[5][koenigY]) {
                    if (Schachbrett[koenigX + 1][koenigY] == 0) {
                        //koenigX = koenigX + 1;
                        output[0][2] = true;
                    }
                }
                //koenig
                if (Schachbrett[koenigX][koenigY] != Schachbrett[0][koenigY]) {
                    if (Schachbrett[koenigX - 1][koenigY] == 0) {
                        //koenigX = koenigX + 1;
                        output[0][3] = true;
                    }
                }
                //---------------------------------------------------------------------------------------\\
                //die anderen 4 richtungen

                if (Schachbrett[koenigX][koenigY] != Schachbrett[5][5]) {
                    if (Schachbrett[koenigX + 1][koenigY + 1] == 0) {
                        output[0][4] = true;
                    }
                }
                //koenig
                if (Schachbrett[koenigX][koenigY] != Schachbrett[0][0]) {
                    if (Schachbrett[koenigX - 1][koenigY - 1] == 0) {
                        output[0][5] = true;
                    }
                }
                //koenig
                if (Schachbrett[koenigX][koenigY] != Schachbrett[0][5]) {
                    if (Schachbrett[koenigX - 1][koenigY + 1] == 0) {
                        output[0][6] = true;
                    }
                }
                //koenig
                if (Schachbrett[koenigX][koenigY] != Schachbrett[5][0]) {
                    if (Schachbrett[koenigX + 1][koenigY - 1] == 0) {
                        output[0][7] = true;
                    }
                }
            }
            //---------------------------------------------------------------------------------------\\
            //turm
            if (Schachbrett[turmX][turmY] != Schachnre){

            }
        }


        return output;
    }
}
