package model;

public class King extends Piece {

    public King() {
        super();
        img = "assets/BlackRook.png";
    }

    public void moveKing(int inX, int inY){
        x = x + inX;
        y = y + inY;
    }

}
