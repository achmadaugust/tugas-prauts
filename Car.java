/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author AT
 */
public class Car {
    private int speedMax = 160;
    private int speed = 0;
    private int speedActual = 0;
    private boolean start = false;
    
    public Car() {
    }

    public int getSpeedMax() {
        return speedMax;
    }

    public void setSpeedMax(int speedMax) {
        this.speedMax = speedMax;
    }
    
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeedActual() {
        return speedActual;
    }

    public void setSpeedActual(int speedActual) {
        this.speedActual = speedActual;
    }

    public boolean isStart() {
        return start;
    }

    public void Start(boolean start) {
        System.out.println("Engine Started!\n");        
        this.start = start;
    }
    
    public void shiftGear(int gear){
        switch(gear){
            case 0 :
                this.setSpeed(0);
                System.out.println("Gear " + gear);
                break;
            case 1 :
                this.setSpeed(10);
                System.out.println("Gear " + gear);
                break;
            case 2 :
                this.setSpeed(15);
                System.out.println("Gear " + gear);
                break;
            case 3 :
                this.setSpeed(20);
                System.out.println("Gear " + gear);
                break;
            case 4 :
                this.setSpeed(25);
                System.out.println("Gear " + gear);
                break;
            case 5 :
                this.setSpeed(30);
                System.out.println("Gear " + gear);
                break;        
        }
    }
    
    public void gas(){
        if ((this.getSpeed() + this.getSpeedActual()) <= this.getSpeedMax()) {
            this.setSpeedActual(this.getSpeed() + this.getSpeedActual());            
        }else this.setSpeedActual(this.getSpeedMax());        
    }
    
    public void breaks(){
        this.setSpeedActual(this.getSpeedActual()/3);        
    }
    
}