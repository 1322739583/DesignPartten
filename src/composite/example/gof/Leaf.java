package composite.example.gof;

public class Leaf implements Component{

    String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void operate() {
        System.out.println("————"+name);
    }
}
