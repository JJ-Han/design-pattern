package decorator.starbuzz;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Decar Coffee";
    }

    public double cost() {
        return 1.05;
    }
}
