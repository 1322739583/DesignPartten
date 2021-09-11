package brige.example.product.v1;

public class HouseCorperation extends Corperation{

    @Override
    protected void produce() {
        System.out.println("house produce");
    }

    @Override
    protected void sell() {
        System.out.println("house sell");
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("house make money");
    }
}
