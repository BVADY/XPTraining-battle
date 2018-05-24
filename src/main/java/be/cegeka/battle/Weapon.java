package be.cegeka.battle;


public abstract class Weapon {

    private int damage;

    private Class<? extends Weapon> effectiveAgainst;

    public Weapon(int damage, Class<? extends Weapon> effectiveAgainst) {
        this.damage = damage;
        this.effectiveAgainst = effectiveAgainst;
    }


    public int getDamage() {
        return damage;
    }


    public Class<? extends Weapon> getEffectiveAgainst() {
        return effectiveAgainst;
    }

}
