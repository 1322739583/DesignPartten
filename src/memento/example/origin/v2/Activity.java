package memento.example.origin.v2;

/**
 * 改进版本：v2
 * 封装了一个StateStore类，也就是备忘录类
 */
public class Activity {
    //crash异常退出  onplay正在显示
    private String state="";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public StateStore createStore(){
        return new StateStore(this.state);
    }

    public void restore(StateStore store){
        setState(store.getState());
    }
}
