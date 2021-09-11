package decorator.beverage;

public class Mocha extends CodimentDecorator{
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",mocha";
    }

    @Override
    public double cost() {
        return 0.1+beverage.cost();
    }


}
