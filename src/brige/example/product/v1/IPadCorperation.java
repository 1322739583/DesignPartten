package brige.example.product.v1;

public class IPadCorperation extends Corperation{

    @Override
    protected void produce() {
        System.out.println("ipad produce");
    }

    @Override
    protected void sell() {
        System.out.println("ipad sell");
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("ipad make money");
    }

}
