package be.cegeka.battle;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ArmyTest {

    @Test
    public void enrollSoldierInArmyTest() {
        Soldier soldier = new Soldier("name");

        Army army = new Army();

        army.addSoldierToArmy(soldier);

        assertTrue(army.hasSoldier(soldier));
    }

    @Test
    public void checkFrontManInArmyTest() {
        Soldier soldier = new Soldier("soldier1");

        Army army = new Army();

        army.addSoldierToArmy(soldier);

        assertEquals("soldier1", army.getSoldiersInArmy().get(0).getName());
    }

    public void testSoldierIdFromHQ() {
        Army army = new Army();
        Soldier soldier = new Soldier("soldaat");

        army.addSoldierToArmy(soldier);
        assertNotNull(soldier.getId());

    }

    @Test
    public void testWar() {
        Army army = new Army();
        Army army2 = new Army();
        Soldier soldier = new Soldier("soldaat");
        Soldier soldier2 = new Soldier("soldaat");
        soldier2.setWeapon(new Axe());

        army.addSoldierToArmy(soldier);
        army2.addSoldierToArmy(soldier2);

        assertEquals(army.war(army2), soldier.getId() + " dies");

    }


    @Test
    public void testWinningSoldier() {
        Army army = new Army();
        Army army2 = new Army();
        Soldier soldier = new Soldier("soldaat");
        Soldier soldier2 = new Soldier("soldaat");
        soldier.setWeapon(new Axe());

        army.addSoldierToArmy(soldier);
        army2.addSoldierToArmy(soldier2);

        assertEquals(army.war(army2), army.getSoldiersInArmy().size() + " left");

    }


    @Test
    public void testDeathSoldier() {
        Soldier soldier = new Soldier("soldaat");
        Soldier soldier2 = new Soldier("soldaat");


    }


}
