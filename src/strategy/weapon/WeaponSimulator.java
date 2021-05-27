package strategy.weapon;

public class WeaponSimulator {
    public static void main(String[] args) {
        Party party = new Party();
        party.join(new King("Arthur"));
        party.join(new Knight("Lancelot"));

        party.fight();

        party.setWeapon(0, new BowAndArrowBehavior());
        party.fight();

        party.exchangeWeapon(0, 1);
        party.fight();
    }
}
