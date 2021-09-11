package brige.parttern;

public abstract class Abstraction {
    private Implementor impl;

    public Abstraction(Implementor impl) {
        this.impl = impl;
    }

    public Implementor getImpl() {
        return impl;
    }

    public void request(){
        this.impl.doSomeThing();
    }
}
