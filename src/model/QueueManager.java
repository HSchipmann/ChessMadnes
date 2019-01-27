package model;

import akkgframework.model.abitur.datenstrukturen.Queue;

public class QueueManager {

    private PowerUp powerUp;
    private Queue<PowerUp> powerUpQueue;
    private Schachbrett schachbrett;

    public QueueManager(Schachbrett schachbrett){
        powerUpQueue = new Queue<PowerUp>();
        this.schachbrett=schachbrett;
    }

    //fügt ein neues random PowerUp in die Queue
    public String addNewPowerUp(){
        powerUp = new PowerUp(schachbrett);
        powerUpQueue.enqueue(powerUp);
        System.out.println("Neues PowerUp hinzugefügt");
        return powerUp.getImage();
    }


    //Entfernt das erste PowerUp aus der Queue und returnt es danach
    public PowerUp realesePowerUp(){
        PowerUp topPowerup= powerUpQueue.front();
        if(!powerUpQueue.isEmpty()){
            powerUpQueue.dequeue();
        }
        return topPowerup;
    }



}
