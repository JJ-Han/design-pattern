package strategy.weapon;

public class King extends Character {
    public King() {
        name = "King";
        weapon = new AxeBehavior();
    }
    public King(String name) {
        this.name = name;
        weapon = new AxeBehavior();
    }
    public King(WeaponBehavior weapon) {
        name = "King";
        this.weapon = weapon;
    }
}
