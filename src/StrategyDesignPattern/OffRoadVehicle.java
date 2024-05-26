package StrategyDesignPattern;

import StrategyDesignPattern.WithStrategyDesignPattern.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
