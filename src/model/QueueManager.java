package model;

import akkgframework.model.abitur.datenstrukturen.Queue;

public class QueueManager {

    private PowerUp powerUp;
    private Queue<PowerUp> powerUpQueue;

    public QueueManager(){
        powerUpQueue = new Queue<>();
    }

    //fügt ein neues random PowerUp in die Queue
    public String addNewPowerUp(){
        powerUp = new PowerUp();
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
