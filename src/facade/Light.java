package facade;

public class Light {

    private static Light instance=new Light();

    public static Light getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("Light on");
    }

    public void off(){
        System.out.println("Light off");
    }
}
