package memento.example.origin.v4;

import java.beans.Introspector;

/**
 * 改进版本v4
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
        return new StateStore(BeanUtils.backup(this));
    }

    public void restore(StateStore store){
        BeanUtils.restore(this,store.getMap());
    }
}
