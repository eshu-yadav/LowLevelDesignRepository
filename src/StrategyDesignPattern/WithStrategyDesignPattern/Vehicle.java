package StrategyDesignPattern.WithStrategyDesignPattern;

public class Vehicle {
    DriveStrategy driveStrategyObject;

    // This is known as constructor injection
    public Vehicle(DriveStrategy driveStrategyObject){
        this.driveStrategyObject = driveStrategyObject;
    }

    public void drive(){
        driveStrategyObject.drive();
    }
}
