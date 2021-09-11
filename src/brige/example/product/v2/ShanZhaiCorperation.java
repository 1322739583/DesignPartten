package brige.example.product.v2;

public class ShanZhaiCorperation extends Corperation{
    public ShanZhaiCorperation(Product product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("ShanZhaiCorperation make money");
    }
}
