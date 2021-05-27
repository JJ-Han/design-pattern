package strategy.weapon;

public class knifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("knife, knife, knife");
    }

    @Override
    public String toString() {
        return "Knife";
    }
}
