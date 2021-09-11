package memento;

public class Originater {
    private String state="";

    public String getStage() {
        return state;
    }

    public void setStage(String state) {
        this.state = state;
    }

    public IMemento createMemento(){
       return new Memento(this.state);
    }

    public void restoreMenento(IMemento memento){
        setStage(((Memento)memento).getState());
    }
}
