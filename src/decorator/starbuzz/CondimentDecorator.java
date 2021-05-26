package decorator.starbuzz;

public abstract class CondimentDecorator extends Beverage {
    public Beverage beverage;

    @Override
    public abstract String getDescription();

    @Override
    public Size getSize() {
        return beverage.getSize();
    }

    @Override
    // override here is really necessary?
    public void setSize(Size size) {
        beverage.setSize(size);
    }
}
