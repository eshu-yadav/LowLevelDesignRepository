package StrategyDesignPattern.WithStrategyDesignPattern;

public class OffRoadVehicle extends Vehicle {
    OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
