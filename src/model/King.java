package model;

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
            img = "assets/WhiteRook.png";
        }else{
            img = "assets/BlackRook.png";
        }
    }
}
