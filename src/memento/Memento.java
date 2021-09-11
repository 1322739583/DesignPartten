package memento;

public class Memento implements IMemento{
    private String state="";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento(String state) {
        this.state=state;
    }
}
