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
        MediaPlayer stereo= new MediaPlayer() {
            @Override
            public void upgradeWheels() {

            }

            @Override
            public void upgradeEngine() {

            }
        };
        stereo.start();
        stereo.next();
        stereo.previous();
        stereo.stop();

        //For upgrade of media
        stereo.upgradeMedia();

        //upgrade car wheels and Engine
        normalCar.upgradeEngine();
        normalCar.upgradeWheels();
        normalCar.upgradeEngine();


    }
}
