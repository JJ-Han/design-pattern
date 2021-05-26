package decorator.starbuzz;

public abstract class Beverage {
    public enum Size { TALL, GRANDE, VENTI };
    public Size size = Size.TALL;
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public String toString() {
        return getDescription() + " SIZE: " + getSize() + " $" + cost();
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }

    public abstract double cost();
}
