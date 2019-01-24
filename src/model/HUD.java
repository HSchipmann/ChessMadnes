package model;

import akkgframework.model.fundamental.GraphicalObject;
import akkgframework.view.DrawTool;

public class HUD extends GraphicalObject{

    private String player1;
    private String player2;

    public HUD(String player1,String player2){
        this.player1=player1;
        this.player2=player2;
    }

    public void draw(DrawTool drawTool){
        drawTool.drawText(50,200,player1);
        drawTool.drawText(50,750,player2);
    }



}
