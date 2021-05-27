package strategy.weapon;

public class AxeBehavior implements WeaponBehavior {
    public AxeBehavior() {}

    @Override
    public void useWeapon() {
        System.out.println("AXE AXE AXE");
    }

    @Override
    public String toString() {
        return "AXE";
    }
}
