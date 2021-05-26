package decorator.starbuzz;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " w. Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
