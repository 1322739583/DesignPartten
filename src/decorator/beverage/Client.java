package decorator.beverage;

public class Client {
    public static void main(String[] args) {
        Beverage beverage1=new HouseBlend();
        System.out.println(beverage1.getDescription()+" $"+FormatUtil.format(beverage1.cost()));
        beverage1=new Milk(beverage1);
        System.out.println(beverage1.getDescription()+" $"+FormatUtil.format(beverage1.cost()));
        beverage1=new Soy(beverage1);
        beverage1=new Mocha(beverage1);
        System.out.println(beverage1.getDescription()+" $"+FormatUtil.format(beverage1.cost()));

    }
}
