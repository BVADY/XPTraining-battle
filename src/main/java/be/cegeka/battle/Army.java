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
        soldier.setId(hq.reportEnlistment(soldier, soldiersInArmy));
        soldiersInArmy.add(soldier);
    }

    public boolean hasSoldier(Soldier soldier) {
        return soldiersInArmy.contains(soldier);
    }


    public String war(Army opponents) {

        if (this.getSoldiersInArmy().size() < 1) {
            return hq.reportVictory(opponents.getSoldiersInArmy().size());
        }
        if (opponents.getSoldiersInArmy().size() < 1) {
            return hq.reportVictory(this.getSoldiersInArmy().size());
        }


        Soldier ourFrontMan = this.getSoldiersInArmy().get(0);
        Soldier enemyFrontMan = opponents.getSoldiersInArmy().get(0);

        Soldier winner = ourFrontMan.fight(enemyFrontMan);

        if (winner.equals(ourFrontMan)) {
            opponents.soldiersInArmy.remove(enemyFrontMan);
            return hq.reportCasualty(enemyFrontMan.getId());
        }

        this.soldiersInArmy.remove(ourFrontMan);
        return hq.reportCasualty(ourFrontMan.getId());


    }


}
