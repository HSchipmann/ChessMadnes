package model;

import akkgframework.view.DrawTool;

public class Rook extends Piece {

    public Rook(int x,int y, String color){
        assignColor(color);
        this.x = x;
        this.y = y;
    }

    public void moveRook(int inX, int inY){
        double helpX=x;
        double helpY=y;
        if(helpX-inX==0){
            y=inY;
        }
        if(helpY-inY==0){
            x=inX;
        }
    }

    public void assignColor(String color){
        if (color.equals("White")){
            createAndSetNewImage("src/assets/whiteRook.png");
        }else{
            createAndSetNewImage("src/assets/BlackRook.png");
        }
    }

    public void draw(DrawTool drawTool){
        drawTool.drawImage(getMyImage(),x,y);
    }

}