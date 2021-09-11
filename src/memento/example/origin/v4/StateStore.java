package memento.example.origin.v4;

import java.util.HashMap;
import java.util.Map;

public class StateStore {
    private Map<String,Object> map=new HashMap<>();

    public StateStore(Map<String, Object> map) {
        this.map = map;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }
}
