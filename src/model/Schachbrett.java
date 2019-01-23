package model;

import akkgframework.model.abitur.datenstrukturen.Graph;
import akkgframework.model.fundamental.GraphicalObject;
import akkgframework.model.fundamental.Tileset;
import akkgframework.view.DrawTool;

public class Schachbrett extends GraphicalObject {

    private Tileset tileset;
    private int[][] mapArray;


    public Schachbrett(){
        //tileset benutzen um Bild einfach zu zeichnen
        tileset = new Tileset("src/assets/whiteTile.png",150,150);
        createMapArray();
    }

    //Bild zeichnen
    public void drawTool(DrawTool drawTool){
        drawTool.drawImage(tileset.getTile(0,1),0,0);
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



}
