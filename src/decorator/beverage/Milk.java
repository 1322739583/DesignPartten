package decorator.beverage;

public class Milk extends CodimentDecorator{
    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",milk";
    }

    @Override
    public double cost() {
        return 0.2+beverage.cost();
    }
}
