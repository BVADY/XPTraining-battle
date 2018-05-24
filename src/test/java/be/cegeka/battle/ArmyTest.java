package be.cegeka.battle;

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

}
