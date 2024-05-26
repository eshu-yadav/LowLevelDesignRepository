package StrategyDesignPattern.WithStrategyDesignPattern;

public class GoodsVehicle extends Vehicle {
    GoodsVehicle(){
        super(new NormalDriveStrategy());
    }
}
