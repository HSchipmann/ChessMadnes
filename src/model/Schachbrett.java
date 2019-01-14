package model;

import akkgframework.model.abitur.datenstrukturen.Graph;
import akkgframework.model.fundamental.GraphicalObject;
import akkgframework.model.fundamental.Tileset;
import akkgframework.view.DrawTool;

public class Schachbrett extends GraphicalObject {

    private Tileset tileset;

    public Schachbrett(){
        tileset = new Tileset("src/assets/whiteTile.png",150,150);
    }

    public void drawTool(DrawTool drawTool){
        drawTool.drawImage(tileset.getTile(0,1),0,0);
    }





}
