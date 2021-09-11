package memento.example.origin.v2;
public class Client {
    public static void main(String[] args) {
       Activity activity=new Activity();
       activity.setState("onPlay");
        System.out.println("current state: start and "+activity.getState());
        StateStore store = activity.createStore();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        activity.setState("crash");


        System.out.println("current state: "+activity.getState());
        activity.restore(store);
        System.out.println("current state :back to "+activity.getState());
    }
}
