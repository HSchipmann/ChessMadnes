package model;

import akkgframework.view.DrawTool;

public class King extends Piece {

    public King(int x,int y, String color){
        assignColor();
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void moveKing(int inX, int inY){
        x = x + inX;
        y = y + inY;
    }

    public void assignColor(){
        if (color.equals("White")){
            createAndSetNewImage("assets/WhiteKing.png");
        }else{
            createAndSetNewImage("assests/BlackKing.png");
        }
    }

    public void draw(DrawTool drawTool){
        drawTool.drawImage(getMyImage(),x,y);
    }
}
