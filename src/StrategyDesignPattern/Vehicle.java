package StrategyDesignPattern;

import StrategyDesignPattern.WithStrategyDesignPattern.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategyObject;

    // This is known as constructor injection
    Vehicle(DriveStrategy driveStrategyObject){
        this.driveStrategyObject = driveStrategyObject;
    }

    public void drive(){
        driveStrategyObject.drive();
    }
}
