package memento.example.origin.v3;

/**
 * 改进版本v3
 * 添加StoreManager类实现对StateStore的管理。
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
