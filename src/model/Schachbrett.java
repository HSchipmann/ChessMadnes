package model;

import akkgframework.model.abitur.datenstrukturen.Graph;
import akkgframework.model.fundamental.GraphicalObject;
import akkgframework.model.fundamental.Tileset;
import akkgframework.view.DrawTool;

import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

public class Schachbrett extends GraphicalObject {

    private int[][] mapArray;
    private King whiteKing;
    private King blackKing;
    private Rook whiteRook;
    private Rook blackrook;
    private boolean wrselected;
    private boolean brselected;
    private boolean wkselected;
    private boolean bkselected;
    private boolean wmoved;
    private boolean bmoved;



    public Schachbrett(King whiteKing, King blackKing, Rook whiteRook, Rook blackRook) {
        this.whiteKing = whiteKing;
        this.blackKing = blackKing;
        this.whiteRook = whiteRook;
        this.blackrook = blackRook;
        mapArray = new int[6][6];
        createMapArray();
        createAndSetNewImage("src/assets/board.Tilefertig.png");
        bmoved=true;
    }

    //Map erstellen in der kein Platz belegt ist
    public void createMapArray() {
        for (int i = 0; i < mapArray.length; i++) {
            for (int j = 0; j < mapArray[i].length; j++) {
                mapArray[i][j] = 0;
            }
        }
    }

    public void draw(DrawTool drawTool) {
        drawTool.drawFilledRectangle(0, 0, 2000, 2000);
        drawTool.drawImage(getMyImage(), 300, 85);
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println(e.getX() + " " + e.getY());
        if (e.getX() > 300 && e.getY() > 85 && e.getX() < 1200 && getCollision((int) e.getX(), (int) e.getY())) {
            System.out.println("Object Selected");
            selectObject((int) e.getX(), (int) e.getY());
        }
        if (e.getX() > 300 && e.getY() > 85 && e.getX() < 1200 && !getCollision((int) e.getX(), (int) e.getY())) {
            moveObject(e.getX(), e.getY());
        }else if(e.getX() > 300 && e.getY() > 85 && e.getX() < 1200 &&!wmoved&&getCollisionBlack((int) e.getX(), (int) e.getY())){
            moveObject(e.getX(), e.getY());
        }else if(e.getX() > 300 && e.getY() > 85 && e.getX() < 1200 &&!bmoved&&getCollisionWhite((int) e.getX(), (int) e.getY())){
        moveObject(e.getX(), e.getY());
    }


    }

    /*
    Die Methode changeMapArray bekommt die Koordinaten eines Objektes auf dem Schachbrett
    und setzt im zwei Dimensionalem Array an der Stelle wo sich die Figur befindet eine eins.
     */
    public void changeMapArray(int x, int y, int type) {
        x -= 300;
        y -= 85;
        for (int i = 0; i < mapArray.length; i++) {
            for (int j = 0; j < mapArray[i].length; j++) {
                if (x == 150 * i && y == j * 150) {
                    mapArray[i][j] = type;
                }
            }
        }
    }

    /* Rechnet die Übergebenen Koordinaten des MausCursers um und zählt dann durch das zwei dimensionale
        Array um zu überprüfen ob an der Stelle ein Objekt ist oder nicht, dann gibt es true oder false zurück.
     */
    public boolean getCollision(int x, int y) {
        x = (x - 300) / 150;
        y = (y - 85) / 150;
        if (mapArray[x][y] >= 1) {
            return true;
        }
        return false;
    }

    public boolean getCollisionWhite(int x,int y){
        x = (x - 300) / 150;
        y = (y - 85) / 150;
        if(mapArray[x][y]==1||mapArray[x][y]==3){
            return true;
        }
        return false;
    }

    public boolean getCollisionBlack(int x,int y){
        x = (x - 300) / 150;
        y = (y - 85) / 150;
        if(mapArray[x][y]==2||mapArray[x][y]==4){
            return true;
        }
        return false;
    }


    public void selectObject(int x, int y) {
        int helpX = (x - 300) / 150;
        int helpY = (y - 85) / 150;
        if (mapArray[helpX][helpY] == 1&&bmoved) {
            wrselected = true;
            brselected = false;
            wkselected = false;
            bkselected = false;
        } else if (mapArray[helpX][helpY] == 2&&wmoved) {
            wrselected = false;
            brselected = true;
            wkselected = false;
            bkselected = false;
        } else if (mapArray[helpX][helpY] == 3&&bmoved) {
            wrselected = false;
            brselected = false;
            wkselected = true;
            bkselected = false;
        } else if (mapArray[helpX][helpY] == 4&&wmoved) {
            wrselected = false;
            brselected = false;
            wkselected = false;
            bkselected = true;
        }
    }

    public void moveObject(int x, int y) {
        if (wrselected) {
            mapArray[(int)(whiteRook.getX()-300)/150][(int)(whiteRook.getY()-85)/150]=0;
            whiteRook.moveRook(handleChessboardMovement(x,y)[0],handleChessboardMovement(x,y)[1]);
            wrselected=false;
            wmoved=true;
            bmoved=false;
        }else if (brselected) {
            mapArray[(int)(blackrook.getX()-300)/150][(int)(blackrook.getY()-85)/150]=0;
            blackrook.moveRook(handleChessboardMovement(x,y)[0],handleChessboardMovement(x,y)[1]);
            brselected=false;
            wmoved=false;
            bmoved=true;
        }else if(wkselected){
            mapArray[(int)(whiteKing.getX()-300)/150][(int)(whiteKing.getY()-85)/150]=0;
            whiteKing.moveKing(handleChessboardMovement(x,y)[0],handleChessboardMovement(x,y)[1]);
            wkselected=false;
            wmoved=true;
            bmoved=false;
        }else if(bkselected){
            mapArray[(int)(blackKing.getX()-300)/150][(int)(blackKing.getY()-85)/150]=0;
            blackKing.moveKing(handleChessboardMovement(x,y)[0],handleChessboardMovement(x,y)[1]);
            bkselected=false;
            wmoved=false;
            bmoved=true;
        }
    }

    public int[] handleChessboardMovement(int x,int y){
        x = (x - 300) / 150;
        y = (y - 85) / 150;
        x*=150;
        y*=150;
        return new int[]{x+300,y+85};
    }

    public boolean getBmoved(){
        return bmoved;
    }

    public boolean getWmoved(){
        return wmoved;
    }

    public void setWmoved(boolean b){
        wmoved=b;
    }

    public void setBmoved(boolean b){
        bmoved=b;
    }



}