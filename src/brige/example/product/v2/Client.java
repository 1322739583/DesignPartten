package brige.example.product.v2;

public class Client {
    public static void main(String[] args) {
        House house=new House();
        HouseCorperation houseCorp=new HouseCorperation(house);
        houseCorp.makeMoney();
        ShanZhaiCorperation shanZhaiCorp=new ShanZhaiCorperation(new IPad());
        shanZhaiCorp.makeMoney();
    }
}
