package brige.example.product.v1;

public abstract class Corperation {

    protected abstract void produce();
    protected abstract void sell();


    public void makeMoney(){
        this.produce();
        this.sell();
    }
}
