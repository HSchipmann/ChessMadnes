package model;

public class Rook extends Piece {

    public Rook(int x,int y, String color){
        assignColor();
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