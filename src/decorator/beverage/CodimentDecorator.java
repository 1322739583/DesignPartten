package decorator.beverage;

public abstract class CodimentDecorator extends Beverage{
    private Beverage beverage;
    public abstract String getDescription();

}
