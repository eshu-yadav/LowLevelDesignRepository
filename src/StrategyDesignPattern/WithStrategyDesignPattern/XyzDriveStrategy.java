package StrategyDesignPattern.WithStrategyDesignPattern;

public class XyzDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Driving with xyz");
    }
}
