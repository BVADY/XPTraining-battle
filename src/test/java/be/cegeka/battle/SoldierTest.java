package be.cegeka.battle;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SoldierTest {

    @Test
    public void construction_ASoldierMustHaveAName() {
        Soldier soldier = new Soldier("name");

        assertThat(soldier.getName()).isEqualTo("name");
    }

    @Test(expected = IllegalArgumentException.class)
    public void construction_ASoldierMustHaveAName_CannotBeNull() {
        new Soldier(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void construction_ASoldierMustHaveAName_CannotBeEmpty() {
        new Soldier("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void construction_ASoldierMustHaveAName_CannotBeBlank() {
        new Soldier("   ");
    }

    @Test

    public void testDefaultWeaponOfSoldier() {
        Soldier soldier = new Soldier();
        Weapon weapon = new BareFist();

        assertThat(soldier.getWeapon().getClass()).isEqualTo(weapon.getClass());


    }


    @Test
    public void testChangeWeaponSword() {
        Soldier soldier = new Soldier();
        soldier.setWeapon(new Sword());
        Weapon weapon = new Sword();
        assertThat(soldier.getWeapon().getClass()).isEqualTo(weapon.getClass());
    }

    @Test
    public void testChangeWeaponSpear() {
        Soldier soldier = new Soldier();
        soldier.setWeapon(new Spear());
        Weapon weapon = new Spear();
        assertThat(soldier.getWeapon().getClass()).isEqualTo(weapon.getClass());
    }

    @Test
    public void testChangeWeaponAxe() {
        Soldier soldier = new Soldier();
        soldier.setWeapon(new Axe());
        Weapon weapon = new Axe();
        assertThat(soldier.getWeapon().getClass()).isEqualTo(weapon.getClass());
    }

    @Test
    public void testWeaponDamageAxe() {
        Weapon weapon = new Axe();
        assertEquals(weapon.getDamage(), 3);
    }


    @Test
    public void testWeaponDamageSword() {
        Weapon weapon = new Sword();
        assertEquals(weapon.getDamage(), 2);
    }

    @Test
    public void testWeaponDamageSpear() {
        Weapon weapon = new Spear();
        assertEquals(weapon.getDamage(), 2);
    }


    @Test
    public void testWeaponDamageBareFist() {
        Weapon weapon = new BareFist();
        assertEquals(weapon.getDamage(), 1);
    }


}