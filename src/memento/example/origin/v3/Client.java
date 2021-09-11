package memento.example.origin.v3;

public class Client {
    public static void main(String[] args) {
       Activity activity=new Activity();
       activity.setState("onPlay");
        System.out.println("current state: start and "+activity.getState());
        StoreManager manager=new StoreManager();
        manager.setStateStore(activity.createStore());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        activity.setState("crash");

        System.out.println("current state: "+activity.getState());
        activity.restore(manager.getStateStore());
        System.out.println("current state :back to "+activity.getState());
    }
}
