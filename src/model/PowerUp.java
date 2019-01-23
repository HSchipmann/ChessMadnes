package model;

public class PowerUp {

    protected String img;
    private int x;
    private int y;


    public PowerUp(){
        addToBoard();
    }

    private void addToBoard(){
        x=(int)Math.random()*5;
        y=(int)Math.random()*5;
    }

    public String getImg(){
        return img;
    }
}
