package StrategyDesignPattern.WithStrategyDesignPattern;

public class SportsVehicle extends Vehicle {

    SportsVehicle(){
        super(new SportsDriveStrategy());
    }
}
