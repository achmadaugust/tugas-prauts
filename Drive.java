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
import java.util.*;
public class Drive {
    public static void main(String[] args){
        Car newCar = new Car();

        Scanner x = new Scanner(System.in);
        
        boolean stopper = false;
        
        while(!stopper){
            System.out.println("Drive your car!");
            System.out.println("\n1. Start");
            System.out.println("2. Break");
            System.out.println("3. Shift Gear");
            System.out.println("4. Gas");
            System.out.println("5. Stop");
            System.out.println("\nSpeedometer : " + newCar.getSpeedActual() + 
                    " Km/H");
            System.out.print("Your Choice : ");
            int choice = x.nextInt() ;
            System.out.println();            
            switch (choice){
                case 1 :
                    newCar.Start(true);
                    break;
                case 2:
                    if (newCar.isStart()) {
                        newCar.breaks();
                        break;
                    } else {
                        System.out.println("First start your engine car pelase\n");
                        break;
                    }
                case 3:
                    if (newCar.isStart()) {
                        System.out.print("Change gear to (1-5): ");
                        newCar.shiftGear(x.nextInt());
                        break;
                    } else {
                        System.out.println("First start your engine car please\n");
                        break;
                    }
                case 4:
                    if (newCar.isStart()) {
                        newCar.gas();
                        break;
                    } else {
                        System.out.println("First start your engine car please\n");
                        break;
                    }
                case 5 :
                    stopper = true;
                    System.out.println("Car is stopped");
                    break;
            }
        }
    }
}
