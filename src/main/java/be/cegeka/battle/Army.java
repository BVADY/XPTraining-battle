package be.cegeka.battle;

import java.util.ArrayList;

public class Army {

    private ArrayList<Soldier> soldiersInArmy = new ArrayList<Soldier>();

    private Headquarters hq = new Headquarters();


    public ArrayList<Soldier> getSoldiersInArmy() {
        return soldiersInArmy;
    }

    public void setSoldiersInArmy(ArrayList<Soldier> soldiersInArmy) {
        this.soldiersInArmy = soldiersInArmy;
    }

    public void addSoldierToArmy(Soldier soldier) {
        hq.reportEnlistment(soldier, soldiersInArmy);
        soldiersInArmy.add(soldier);
    }

    public boolean hasSoldier(Soldier soldier) {
        return soldiersInArmy.contains(soldier);
    }


}
