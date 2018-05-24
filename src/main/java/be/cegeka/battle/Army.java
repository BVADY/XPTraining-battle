package be.cegeka.battle;

import java.util.ArrayList;
import java.util.List;

public class Army {

    private List<Soldier> soldiersInArmy = new ArrayList<Soldier>();

    private Headquarters hq = new Headquarters();


    public List<Soldier> getSoldiersInArmy() {
        return soldiersInArmy;
    }

    public void setSoldiersInArmy(List<Soldier> soldiersInArmy) {
        this.soldiersInArmy = soldiersInArmy;
    }

    public void addSoldierToArmy(Soldier soldier) {
        hq.reportEnlistment(soldier.getName());
        soldiersInArmy.add(soldier);
    }

    public boolean hasSoldier(Soldier soldier) {
        return soldiersInArmy.contains(soldier);
    }

}
