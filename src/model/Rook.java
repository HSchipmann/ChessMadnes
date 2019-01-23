package model;

public class Rook extends Piece {

    public Rook(int x,int y, String color){
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
            img = "assets/WhiteKing.png";
        }else{
            img = "assets/BlackKing.png";
        }
    }
}