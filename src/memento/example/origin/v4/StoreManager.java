package memento.example.origin.v4;


public class StoreManager {
    private StateStore stateStore;

    public StateStore getStateStore() {
        return stateStore;
    }

    public void setStateStore(StateStore stateStore) {
        this.stateStore = stateStore;
    }
}
