package model;

import akkgframework.model.fundamental.GraphicalObject;
import akkgframework.view.DrawTool;

public class Player extends GraphicalObject {

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

    public void draw(DrawTool drawTool){
        drawTool.drawText(x,y,myName);
    }
}
