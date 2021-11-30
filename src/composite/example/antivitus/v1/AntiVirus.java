package composite.example.antivitus.v1;

public abstract class AntiVirus {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void killVirus();
}
