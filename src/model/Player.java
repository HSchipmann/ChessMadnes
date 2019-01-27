package model;

import akkgframework.model.fundamental.GraphicalObject;
import akkgframework.view.DrawTool;

public class Player extends GraphicalObject {

    //Attribute
    private String myName;
    public int bewegungspunkte;


    //Referenzen


    //Methoden
    public Player(String name,int x,int y){
        myName = name;
        this.x=x;
        this.y=y;
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(255,255,255,255);
        drawTool.drawText(x,y,myName);
    }
}
