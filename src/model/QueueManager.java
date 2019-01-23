package model;

import akkgframework.model.abitur.datenstrukturen.Queue;

public class QueueManager {

    private PowerUp powerUp;
    private Queue<PowerUp> powerUpQueue;

    public String addNewPowerUp(){
        PowerUp powerUp = new PowerUp();
        powerUpQueue.enqueue(powerUp);
        System.out.println("Neues PowerUp hinzugefügt");
        return powerUp.getImage();
    }

    public PowerUp realesePowerUp(){
        PowerUp topPowerup= powerUpQueue.front();
        if(!powerUpQueue.isEmpty()){
            powerUpQueue.dequeue();
        }
        return topPowerup;
    }



}
