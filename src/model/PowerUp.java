package model;


import akkgframework.model.fundamental.GraphicalObject;
import akkgframework.view.DrawTool;

public class PowerUp extends GraphicalObject {

    private String img;
    private String type;
    private int x;
    private int y;
    private Schachbrett schachbrett;
    private boolean placeFound;


    public PowerUp(){
        while(placeFound = false){
            x = (int) (Math.random() * 3)+2*150+300;
            y = (int) (Math.random() * 3)+2*150+85;
            if(schachbrett.getCollision(x,y)){
                placeFound = true;
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


}
