package brige.example.product.v2;

public class House extends Product{
    @Override
    public void beProduce() {
        System.out.println("house beProduce");
    }

    @Override
    public void beSell() {
        System.out.println("house beSell");
    }
}
