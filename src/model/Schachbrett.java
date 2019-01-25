package model;

import akkgframework.model.abitur.datenstrukturen.Graph;
import akkgframework.model.fundamental.GraphicalObject;
import akkgframework.model.fundamental.Tileset;
import akkgframework.view.DrawTool;

import java.awt.image.BufferedImage;

public class Schachbrett extends GraphicalObject {

    public Tileset tileset;
    public int[][] mapArray;
    private BufferedImage image;


    public Schachbrett(){
        //tileset benutzen um Bild einfach zu zeichnen
        mapArray=new int[5][5];
        createMapArray();
        createAndSetNewImage("src/assets/Tilefertig.png");
    }

    //Map erstellen in der kein Platz belegt ist
    public void createMapArray(){
        for(int i=0; i<mapArray.length;i++){
            for(int j=0; j<mapArray[i].length; j++){
                mapArray[i][j] =0;
            }
        }
    }



    public int[][] changeMapArray(){

        return null;
    }

    public void draw(DrawTool drawTool){
        drawTool.drawFilledRectangle(0,0,2000,2000);
        drawTool.drawImage(getMyImage(),300,85);
    }
}
