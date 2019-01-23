package model;

public class PowerUp {

    private String img;
    private String type;
    private int x;
    private int y;


    public PowerUp(){
        x=(int)Math.random()*5;
        y=(int)Math.random()*5;
        randomType();
    }

    public String getImage(){
        return img;
    }

    public void randomType(){
        int r =0;
        r=(int)Math.random()*2;
        if(r==0){
            type="+1";
            //BIld hier erstellen
        }else if(r==2){
            type="freeze";
            //BIld hier erstellen
        }else{
            type="teleport";
            //BIld hier erstellen
        }

    }


}
