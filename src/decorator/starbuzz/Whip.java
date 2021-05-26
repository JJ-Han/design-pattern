package decorator.starbuzz;

public class Whip extends CondimentDecorator {
    public Whip (Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " w. Whip";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
