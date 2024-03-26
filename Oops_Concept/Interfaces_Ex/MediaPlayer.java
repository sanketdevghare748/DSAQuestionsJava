package Sanket.Oops_Concept.Interfaces_Ex;

public abstract class MediaPlayer implements Media,UpgradeCar{
    @Override
    public void start() {
        System.out.println("This is starting media player");
    }

    @Override
    public void stop() {
        System.out.println("This is stopping a media player.");

    }

    public void next()
    {
        System.out.println("Play next song >>");
    }
    public void previous()
    {
        System.out.println("Play previous song >>");
    }



    @Override
    public void upgradeMedia() {
        System.out.println("The media has been upgraded to latest version..");

    }
}
