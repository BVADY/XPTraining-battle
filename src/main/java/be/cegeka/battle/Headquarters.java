package be.cegeka.battle;

import java.util.ArrayList;
import java.util.Random;

public class Headquarters implements IHeadquarters {


    public Headquarters() {
    }


    @Override
    public int reportEnlistment(Soldier soldier, ArrayList<Soldier> army) {
        Random r = new Random();
        int random = r.nextInt(56481);

        for (Soldier s : army) {
            if (random == s.getId()) {
                return this.reportEnlistment(soldier, army);
            }
        }


        return random;
    }


    @Override
    public String reportCasualty(int soldierId) {
        return soldierId + " dies";
    }


    @Override
    public void reportVictory(int remainingNumberOfSoldiers) {
        throw new UnsupportedOperationException("implement me (after test)");
    }


}
