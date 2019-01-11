package model;

import akkgframework.model.fundamental.Tileset;
import akkgframework.view.DrawTool;

public class Schachbrett {

    private Tileset tileset;

    public Schachbrett(){
        tileset = new Tileset("assets/whiteTile.png",150,150);
    }

    public void drawTool(DrawTool drawTool){
        drawTool.drawImage(tileset.getTile(0,1),0,0);
    }

}
