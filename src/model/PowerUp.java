package model;

public class PowerUp {

    private String type;
    private String img;
    private int x;
    private int y;


    public PowerUp(String type){
        this.type=type;
    }

    public void addToBoard(){
        x=(int)Math.random()*6+1;
        y=(int)Math.random()*6+1;
    }

    public void createImage(){
        if(type=="+1"){

        }
        if(type=="skip"){

        }
        if(type=="swap"){

        }
    }

}
