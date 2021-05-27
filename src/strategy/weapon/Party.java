package strategy.weapon;

import java.util.ArrayList;
import java.util.List;

public class Party extends Character {
    private List<Character> party = new ArrayList<>();
    public void join (Character player) {
        party.add(player);
    }

    @Override
    public void fight() {
        for (Character p : party)
            p.fight();
    }

    public void setWeapon(int idx, WeaponBehavior weapon) {
        if (idx >= party.size()) throw new IllegalArgumentException("invalid index");
        party.get(idx).setWeapon(weapon);
    }

    public void exchangeWeapon(int i, int j) {
        if (i == j) return;
        if (i >= party.size() || j >= party.size()) throw new IllegalArgumentException("invalid index");
        party.get(i).exchangeWeapon(party.get(j));
    }
}
