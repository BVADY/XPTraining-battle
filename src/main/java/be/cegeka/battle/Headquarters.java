package be.cegeka.battle;

import java.util.Random;

public class Headquarters implements IHeadquarters {


    public Headquarters() {
    }


    @Override
    public int reportEnlistment(Soldier soldier) {
        int id;
        Random r = new Random();
        int random = r.nextInt(56481);

        return id;
    }


    @Override
    public void reportCasualty(int soldierId) {
        throw new UnsupportedOperationException("implement me (after test)");
    }


    @Override
    public void reportVictory(int remainingNumberOfSoldiers) {
        throw new UnsupportedOperationException("implement me (after test)");
    }


}
