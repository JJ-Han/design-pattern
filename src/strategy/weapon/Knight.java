package strategy.weapon;

public class Knight extends Character {
    public Knight() {
        this.name = "Knight";
        this.weapon = new swordBehavior();
    }

    public Knight(String name) {
        this.name = name;
        this.weapon = new swordBehavior();
    }

    public Knight(WeaponBehavior weapon) {
        this.name = "Knight";
        this.weapon = weapon;
    }
}
