package model;


import akkgframework.model.fundamental.GraphicalObject;
import akkgframework.view.DrawTool;

public class PowerUp extends GraphicalObject {

    private String img;
    private String type;
    private Schachbrett schachbrett;
    private boolean placeFound;


    public PowerUp(Schachbrett schachbrett){
        this.schachbrett=schachbrett;
        while(!placeFound){
            x = (int) (Math.random() * 6)*150+300;
            y = (int) (Math.random() * 6)*150+85;
            if(!schachbrett.getCollision((int)x,(int)y)){
                placeFound=true;
            }
        }
        randomType();
    }

    public String getImage(){
        return img;
    }

    public void randomType(){
        int r =0;
        r=(int)(Math.random()*2);
        if(r==0){
            type="freeze";
            createAndSetNewImage("src/assets/powerUp.freeze.png");
        }else if(r==1){
            type="swap";
            createAndSetNewImage("src/assets/powerUp.swap.png");
        }
    }

    public void draw(DrawTool drawTool){
        drawTool.drawImage(getMyImage(),x,y);
    }

    public String getType(){
        return type;
    }


}
