package Sanket.Oops_Concept.Interfaces_Ex;

public class Driver {
    public static void main(String[] args) {
        Car normalCar=new Car();
        normalCar.start();
        normalCar.acc();
        normalCar.stop();

        //for brakes
        normalCar.brake();

        //for media
        MediaPlayer stereo= new MediaPlayer();
        stereo.start();
        stereo.next();
        stereo.previous();
        stereo.stop();

        //for Car upgrade
        normalCar.upgradeEngine();
        normalCar.upgradeWheels();
        normalCar.upgradeMedia();








    }
}
