package model;

import akkgframework.view.DrawTool;

public class Rook extends Piece {

    public Rook(int x,int y, String color){
        assignColor(color);
        this.x = x;
        this.y = y;
    }

    public void moveKing(int inX, int inY){
        x = x + inX;
        y = y + inY;
    }

    public void assignColor(String color){
        if (color.equals("White")){
            createAndSetNewImage("src/assets/WhiteRook.png");
        }else{
            createAndSetNewImage("src/assets/BlackRook.png");
        }
    }

    public void draw(DrawTool drawTool){
        drawTool.drawImage(getMyImage(),x,y);
    }
}