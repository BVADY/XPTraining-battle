package be.cegeka.battle;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

import org.apache.commons.lang3.Validate;

public class Soldier {

    private String name;

    private Weapon weapon = new BareFist();

    private int id;

    public Soldier() {
    }

    public Soldier(String name) {
        Validate.isTrue(isNotBlank(name));

        this.name = name;
    }

    String getName() {
        return this.name;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public Soldier fight(Soldier opponent) {
        int ourBonus = 0;
        int enemyBonus = 0;

        if (this.getWeapon().getEffectiveAgainst() != null) {

            if (this.getWeapon().getEffectiveAgainst().getClass().equals(opponent.getWeapon().getClass())) {
                ourBonus = 3;
            }
        }

        if (opponent.getWeapon().getEffectiveAgainst() != null) {
            if (opponent.getWeapon().getEffectiveAgainst().getClass().equals(this.getWeapon().getClass())) {
                enemyBonus = 3;
            }
        }
        if (this.getWeapon().getDamage() + ourBonus < opponent.getWeapon().getDamage() + enemyBonus) {

            return opponent;
        }

        return this;
    }


}
