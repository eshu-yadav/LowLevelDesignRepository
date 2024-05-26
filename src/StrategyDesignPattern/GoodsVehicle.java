package StrategyDesignPattern;

import StrategyDesignPattern.WithStrategyDesignPattern.NormalDriveStrategy;

public class GoodsVehicle extends  Vehicle{
    GoodsVehicle(){
        super(new NormalDriveStrategy());
    }
}
