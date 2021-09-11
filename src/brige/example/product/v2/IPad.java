package brige.example.product.v2;

public class IPad extends Product{
    @Override
    public void beProduce() {
        System.out.println("ipad beProduce");
    }

    @Override
    public void beSell() {
        System.out.println("ipad beSell");
    }
}
