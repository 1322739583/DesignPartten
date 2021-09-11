package brige.parttern;

public class RefinedAbstraction extends Abstraction{
    public RefinedAbstraction(Implementor impl) {
        super(impl);
    }

    @Override
    public void request() {
        super.getImpl().doAnyThing();
    }
}
