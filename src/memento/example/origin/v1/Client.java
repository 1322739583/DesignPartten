package memento.example.origin.v1;



public class Client {
    public static void main(String[] args) {
        Activity activity=new Activity();
        activity.setState("onPlay");
        System.out.println("current activity: start and "+activity.getState());
        Activity backup=new Activity();
        backup.setState(activity.getState());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        activity.setState("crash");
        System.out.println("current activity: "+activity.getState());
        activity.setState(backup.getState());
        System.out.println("current activity :back to "+activity.getState());
    }
}
