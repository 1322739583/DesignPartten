package memento.example.origin.v3;

public class StateStore {
    private String state;

    public StateStore(String state) {
        this.state=state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
