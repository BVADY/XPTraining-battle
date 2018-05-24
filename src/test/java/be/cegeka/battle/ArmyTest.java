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

    public void testWar() {
        Army army = new Army();


    }

    public void testDeathSoldier() {
        Soldier soldier = new Soldier("soldaat");
        Soldier soldier2 = new Soldier("soldaat");


    }


}
