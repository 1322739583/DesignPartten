package composite.partten;

public class Client {
    public static void main(String[] args) {
        Composite root=new Composite("root");
        Leaf leaf1=new Leaf("leaf1");
        Composite composite1=new Composite("composite1");
        Leaf leaf2=new Leaf("leaf2");
        Leaf leaf3=new Leaf("leaf3");
        root.add(leaf1);
        root.add(composite1);
        composite1.add(leaf2);
        composite1.add(leaf3);
        root.operation();
    }
}
