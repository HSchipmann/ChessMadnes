package model;

import akkgframework.model.fundamental.GraphicalObject;
import akkgframework.model.fundamental.Tileset;
import akkgframework.view.DrawTool;

import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

public class Schachbrett extends GraphicalObject {

    public Tileset tileset;
    public int[][] mapArray;
    private BufferedImage image;


    public Schachbrett(){
        //tileset benutzen um Bild einfach zu zeichnen
        mapArray=new int[6][6];
        createMapArray();
        createAndSetNewImage("assets/board.Tilefertig.png");
        changeMapArray(450,235);
        System.out.println(mapArray[1][1]);

    }

    //Map erstellen in der kein Platz belegt ist
    public void createMapArray(){
        for(int i=0; i<mapArray.length;i++){
            for(int j=0; j<mapArray[i].length; j++){
                mapArray[i][j] =0;
            }
        }
    }

    public void draw(DrawTool drawTool){
        drawTool.drawFilledRectangle(0,0,2000,2000);
        drawTool.drawImage(getMyImage(),300,85);
    }

    public void mouseReleased(MouseEvent e){
        if(e.getX()>300&&e.getY()>85&&e.getX()<1200&&getCollision((int)getX(),(int)getY())){
            System.out.println("lol");
        }
    }

    /*
    Die Methode changeMapArray bekommt die Koordinaten eines Objektes auf dem Schachbrett
    und setzt im zwei Dimensionalem Array an der Stelle wo sich die Figur befindet eine eins.
     */
    public void changeMapArray(int x,int y){
        x-=300;
        y-=85;
        for(int i=0;i<mapArray.length;i++){
            for(int j=0; j<mapArray[i].length;j++){
                if(x==150*i&&y==j*150){
                    mapArray[i][j]=1;
                }
            }
        }
    }


    public boolean getCollision(int x,int y){
        x-=300;
        y-=85;
        for(int i=0;i<mapArray.length;i++){
            for(int j=0;j<mapArray[i].length;j++){
                x=x/150*i;
                y=y/150*j;
                if(mapArray[x][y]==1){
                    return true;
                }
            }
        }
        return false;
    }
}
