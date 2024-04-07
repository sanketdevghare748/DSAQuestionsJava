package Sanket.Oops_Concept.Interfaces_Ex;

public class Car implements Engine,Brake,Media,UpgradeCar{
    @Override
    public void upgradeWheels() {
        System.out.println("Wheels has been upgraded");
    }

    @Override
    public void upgradeEngine() {
        System.out.println("Engine has been upgraded");
    }

    @Override
    public void upgradeMedia() {
        System.out.println("Media has been upgraded");

    }

    @Override
    public void brake() {
        System.out.println("Car has a break");
    }

    @Override
    public void start() {
        System.out.println("Car is started");
    }

    @Override
    public void stop() {
        System.out.println("Car has stopped");

    }

    @Override
    public void acc() {
        System.out.println("Car has accelerated");
    }
}
