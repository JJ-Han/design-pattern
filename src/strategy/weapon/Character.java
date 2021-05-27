package strategy.weapon;

public abstract class Character {
    String name;
    WeaponBehavior weapon;

    public void fight() {
        System.out.print(name + ": ");
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior weapon) {
        System.out.println(name + ": weapon changed from " + this.weapon + " to " + weapon);
        this.weapon = weapon;
    }

    public void exchangeWeapon(Character other) {
        WeaponBehavior temp = weapon;
        setWeapon(other.weapon);
        other.setWeapon(temp);
    }
}
