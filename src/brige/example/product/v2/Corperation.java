package brige.example.product.v2;

public abstract class Corperation {
    private Product product;

    public Corperation(Product product) {
        this.product = product;
    }

    public  void makeMoney(){
        this.product.beProduce();
        this.product.beSell();
    }
}
