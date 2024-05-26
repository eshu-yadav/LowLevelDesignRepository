package StrategyDesignPattern.WithStrategyDesignPattern;
public interface DriveStrategy {
    public void drive();

    class GoodsVehicle extends Vehicle {
        GoodsVehicle(){
            super(new NormalDriveStrategy());
        }
    }
}
