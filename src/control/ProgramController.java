package control;

import akkgframework.control.fundamental.UIController;
import akkgframework.model.Display;
import akkgframework.control.fundamental.SoundController;
import akkgframework.model.scenario.ScenarioController;
import akkgframework.view.DrawFrame;
import model.HUD;
import model.Player;
import model.Rook;
import model.Schachbrett;
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
    private StartpanelScreen startpanelScreen;
    private Player player1;
    private Player player2;
    private HUD hud;


    public ProgramController(UIController uiController){
        this.uiController = uiController;
    }


    public void startProgram() {

        programTimer = 0;
        schachbrett = new Schachbrett();
        uiController.registerObject(schachbrett);
        whiterook = new Rook(500,500,"White");
        uiController.registerObject(whiterook);
        blackrook = new Rook(600,700,"Obama");
        uiController.registerObject(blackrook);


    }


    public void updateProgram(double dt){
        programTimer += dt;

    }

}
