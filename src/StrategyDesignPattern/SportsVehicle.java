package StrategyDesignPattern;

import StrategyDesignPattern.WithStrategyDesignPattern.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {

    SportsVehicle(){
        super(new SportsDriveStrategy());
    }
}
