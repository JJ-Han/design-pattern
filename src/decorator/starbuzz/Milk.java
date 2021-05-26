package decorator.starbuzz;

public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " w. Milk";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        Size size = beverage.getSize();
        if (size == Size.TALL) {
            cost += .10;
        } else if (size == Size.GRANDE) {
            cost += .15;
        } else if (size == Size.VENTI) {
            cost += .20;
        }
        return cost;
    }
}
