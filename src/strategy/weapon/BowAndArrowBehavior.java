package strategy.weapon;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("B&A B&A B&A");
    }

    @Override
    public String toString() {
        return "Bow and Arrow";
    }
}
