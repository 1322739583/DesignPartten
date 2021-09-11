package brige.parttern;

public class ConcreteImplementor1 implements Implementor{
    @Override
    public void doSomeThing() {
        System.out.println("doSomeThing");
    }

    @Override
    public void doAnyThing() {
        System.out.println("doAnyThing");
    }
}
