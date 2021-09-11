package brige.example.product.v1;

public class ClothesCorperation extends Corperation{


    @Override
    protected void produce() {
        System.out.println("clothes produce ");
    }


    @Override
    protected void sell() {
        System.out.println("clothes sell");
    }


    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("clothes make money");
    }
}
