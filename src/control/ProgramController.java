package control;

import akkgframework.control.fundamental.UIController;
import akkgframework.model.Display;
import akkgframework.control.fundamental.SoundController;
import akkgframework.model.abitur.datenstrukturen.Graph;
import akkgframework.model.fundamental.GraphicalObject;
import akkgframework.model.scenario.ScenarioController;
import akkgframework.view.DrawFrame;
import model.*;
import view.StartpanelScreen;

/**
 * Ein Objekt der Klasse ProgramController dient dazu das Programm zu steuern. Die updateProgram - Methode wird
 * mit jeder Frame im laufenden Programm aufgerufen.
 */
public class ProgramController {

    //Attribute
    private double programTimer;

    // Referenzen
    private Player p1, p2;

    private UIController uiController;  // diese Referenz soll auf ein Objekt der Klasse uiController zeigen. Über dieses Objekt wird das Fenster gesteuert.
    private Display programmZeitAnzeige;
    private SoundController soundController;
    private Schachbrett schachbrett;
    private DrawFrame drawFrame;
    private Rook whiterook;
    private Rook blackrook;
    private King whiteking;
    private King blackking;
    private StartpanelScreen startpanelScreen;
    private Player player1;
    private Player player2;
    private HUD hud;
    private int poweruptimer;
    private QueueManager queueManager;
    private EndScreen endScreen;
    private PowerUp powerUp;
    private boolean activePowerUp;


    public ProgramController(UIController uiController){
        this.uiController = uiController;
    }


    public void startProgram() {
        poweruptimer=0;
        programTimer = 0;

        player1 = new Player("Weiß",50,150);
        player2 = new Player("Schwarz",50,900);


        whiterook = new Rook(300,85,"White");

        blackrook = new Rook(1050,835,"Obama");

        whiteking = new King(450,85,"White");
        blackking = new King(900,835,"Snoop Dog");


        schachbrett = new Schachbrett(whiteking,blackking,whiterook,blackrook);
        uiController.registerObject(schachbrett);
        uiController.registerObject(whiterook);
        uiController.registerObject(blackrook);
        uiController.registerObject(blackking);
        uiController.registerObject(whiteking);
        uiController.registerObject(player1);
        uiController.registerObject(player2);
        queueManager = new QueueManager(schachbrett);
    }


    public void updateProgram(double dt){
        programTimer += dt;
        poweruptimer -=dt;

        if(poweruptimer<=0&&!activePowerUp){
            queueManager.addNewPowerUp();
            powerUp = queueManager.realesePowerUp();
            uiController.registerObject(powerUp);
            poweruptimer=(int)(Math.random()*100)+50;
            activePowerUp=true;
        }
        schachbrett.changeMapArray((int)whiterook.getX(),(int)whiterook.getY(),1);
        schachbrett.changeMapArray((int)blackrook.getX(),(int)blackrook.getY(),2);
        schachbrett.changeMapArray((int)whiteking.getX(),(int)whiteking.getY(),3);
        schachbrett.changeMapArray((int)blackking.getX(),(int)blackking.getY(),4);

        collision(whiterook,blackrook);
        collision(whiterook,blackking);
        collision(whiteking,blackking);
        collision(whiteking,blackrook);
        if(whiteking.getX()==-200){
            endScreen = new EndScreen("Schwarz");
            uiController.registerObject(endScreen);
            uiController.removeObject(schachbrett);
            uiController.removeObject(whiteking);
            uiController.removeObject(whiterook);
            uiController.removeObject(player2);
            uiController.removeObject(player1);
            uiController.removeObject(blackrook);
            uiController.removeObject(blackking);
        }else if(blackking.getX()==-200){
            endScreen = new EndScreen("Weiß");
            uiController.registerObject(endScreen);
            uiController.removeObject(schachbrett);
            uiController.removeObject(whiteking);
            uiController.removeObject(whiterook);
            uiController.removeObject(player2);
            uiController.removeObject(player1);
            uiController.removeObject(blackrook);
            uiController.removeObject(blackking);
        }

        collisionPowerUP(whiterook);
        collisionPowerUP(whiteking);
        collisionPowerUP(blackrook);
        collisionPowerUP(blackking);
    }

    private void collision(GraphicalObject object1,GraphicalObject object2){
        if(schachbrett.getWmoved()&&object1.getX()==object2.getX()&&object1.getY()==object2.getY()){
            uiController.removeObject(object2);
            schachbrett.changeMapArray((int)object2.getX(),(int)object2.getY(),0);
            object2.setX(-200);
        }else if(schachbrett.getBmoved()&&object1.getX()==object2.getX()&&object1.getY()==object2.getY()){
            uiController.removeObject(object1);
            schachbrett.changeMapArray((int)object1.getX(),(int)object1.getY(),0);
            object1.setX(-200);
        }
    }

    public void collisionPowerUP(GraphicalObject object1){
        if(object1.getX()==powerUp.getX()&&object1.getY()==powerUp.getY()){
            if(powerUp.getType().equals("freeze")){
                if(schachbrett.getWmoved()){
                    schachbrett.setWmoved(false);
                    schachbrett.setBmoved(true);
                    uiController.removeObject(powerUp);
                    powerUp.setX(-2000);
                    activePowerUp=false;
                }else{
                    schachbrett.setWmoved(true);
                    schachbrett.setBmoved(false);
                    uiController.removeObject(powerUp);
                    powerUp.setX(-2000);
                    activePowerUp=false;
                }
            }else if(powerUp.getType().equals("swap")){
                if(schachbrett.getWmoved()){
                    swap(whiteking,whiterook);
                    uiController.removeObject(powerUp);
                    powerUp.setX(-2000);
                    activePowerUp=false;
                }else {
                    swap(blackking,blackrook);
                    uiController.removeObject(powerUp);
                    powerUp.setX(-2000);
                    activePowerUp=false;
                }
            }
        }
    }
    public void swap(GraphicalObject object1,GraphicalObject object2){
        double helpX;
        double helpY;
        helpX = object2.getX();
        helpY = object2.getY();
        object2.setX(object1.getX());
        object2.setY(object1.getY());
        object1.setX(helpX);
        object1.setY(helpY);
        }

}
