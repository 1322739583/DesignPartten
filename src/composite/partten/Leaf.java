package composite.partten;

public class Leaf implements Component {
    private String name;
    public Leaf(String name) {
     this.name=name;
    }

    @Override
    public Composite getComposite() {
        return null;
    }

    @Override
    public void operation() {
        System.out.println(name);
    }
}
