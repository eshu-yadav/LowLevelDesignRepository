package StrategyDesignPattern.WithStrategyDesignPattern;

public class Main {
    public static void main(String[] args) {

        System.out.println("Github Low Level Design Repository");


        System.out.println("----- STRATEGY DESIGN PATTERN ------");

        Vehicle sportsVehicle = new SportsVehicle();
        sportsVehicle.drive();

        Vehicle offRoadVehicle = new OffRoadVehicle();
        offRoadVehicle.drive();

        Vehicle goodsVehicle = new GoodsVehicle();
        goodsVehicle.drive();

        System.out.println("----- STRATEGY DESIGN PATTERN ------");


    }
}