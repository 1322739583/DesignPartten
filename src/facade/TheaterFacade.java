package facade;

public class TheaterFacade {
     private DVDPlayer dvdPlayer;
     private Light light;
     private Screen screen;
     private Stereo stereo;

    public TheaterFacade() {
        this.dvdPlayer = DVDPlayer.getInstance();
        this.light = Light.getInstance();
        this.screen = Screen.getInstance();
        this.stereo = Stereo.getInstance();
    }

    public void ready(){
        screen.down();
        dvdPlayer.on();
        stereo.on();
        dvdPlayer.play();
        stereo.play();
        light.off();
    }

    public void end(){
        screen.up();
        dvdPlayer.off();
        stereo.off();
        stereo.off();
        light.on();
    }

    public void play(){
        dvdPlayer.play();
        stereo.play();
    }

    public void pause(){
        dvdPlayer.pause();
        stereo.pause();
    }
}
