package model;

import akkgframework.view.DrawTool;

public class King extends Piece {

    public King(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
        assignColor();
    }

    public void moveKing(int inX, int inY) {
        double helpX=x;
        double helpY=y;
        if(helpX-inX==0){
            if(y-inY>0){
                y-=150;
            }else{
                y+=150;
            }
        }
        if(helpY-inY==0){
            if(x-inX>0){
                x-=150;
            }else{
                x+=150;
            }
        }else if(helpX-inX>0){
            x-=150;
            if(helpY-inY>0){
                y-=150;
            }else if(helpY-inY<0){
                y+=150;
            }
        }else if(helpX-inX<0) {
            x += 150;
            if (helpY - inY > 0) {
                y -= 150;
            } else if (helpY - inY < 0) {
                y += 150;
            }
        }

    }

    public void assignColor() {
        if (color.equals("White")) {
            createAndSetNewImage("src/assets/piece.whiteKing.png");
        } else {
            createAndSetNewImage("src/assets/piece.blackKing.png");
        }
    }

    public void draw(DrawTool drawTool) {
        drawTool.drawImage(getMyImage(), x, y);
    }


}
