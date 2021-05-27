package strategy.weapon;

public class swordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Sword, Sword, Sword");
    }

    @Override
    public String toString() {
        return "Sword";
    }
}
