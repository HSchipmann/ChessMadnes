package model;

import akkgframework.model.fundamental.GraphicalObject;
import akkgframework.view.DrawTool;

public class EndScreen extends GraphicalObject {

    private String color;

    public EndScreen(String color){
        this.color=color;
    }

    public void draw(DrawTool drawTool){

        drawTool.setCurrentColor(0,0,0,255);
        drawTool.drawFilledRectangle(0,0,2000,2000);
        drawTool.formatText("",3,40);
        drawTool.setCurrentColor(0,0,100,255);

        drawTool.drawText(500,500,color+" hat gewonnen!");
    }
}
