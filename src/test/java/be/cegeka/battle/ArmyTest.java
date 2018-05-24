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

    @Test
    public void testSoldierIdFromHQ() {
        Army army = new Army();
        Soldier soldier = new Soldier("soldaat");

        army.addSoldierToArmy(soldier);
        assertNotNull(soldier.getId());

    }


    @Test
    public void testSoldierDies() {
        Army army = new Army();
        Soldier soldier = new Soldier("soldaat");
        Soldier soldier2 = new Soldier("soldaat");
        Soldier soldier3 = new Soldier("soldaat");

        army.addSoldierToArmy(soldier);
        army.addSoldierToArmy(soldier2);
        army.addSoldierToArmy(soldier3);

        Army army2 = new Army();
        Soldier soldier4 = new Soldier("soldaat");
        Soldier soldier5 = new Soldier("soldaat");
        Soldier soldier6 = new Soldier("soldaat");

        army2.addSoldierToArmy(soldier4);
        army2.addSoldierToArmy(soldier5);

        assertEquals(army.war(army2), soldier4.getId() + " dies");

    }


}
