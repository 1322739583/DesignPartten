package brige.example.product.v1;

public class Client {
    public static void main(String[] args) {
        HouseCorperation houseCorperation=new HouseCorperation();
        houseCorperation.produce();
        houseCorperation.sell();
        houseCorperation.makeMoney();
        ClothesCorperation clothesCorperation=new ClothesCorperation();
        clothesCorperation.produce();
        clothesCorperation.sell();
        clothesCorperation.makeMoney();
        //将服装公司改为ipad产品公司
        //效果是一样的
        IPadCorperation iPadCorperation=new IPadCorperation();
        iPadCorperation.produce();
        iPadCorperation.sell();
        iPadCorperation.makeMoney();

    }
}
