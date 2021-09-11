package brige.example.product.v2;

public class HouseCorperation extends Corperation{

    public HouseCorperation(Product product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("HouseCorperation make money");
    }
}
