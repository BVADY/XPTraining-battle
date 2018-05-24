package be.cegeka.battle;

import java.util.ArrayList;

public interface IHeadquarters {

    int reportEnlistment(Soldier soldier, ArrayList<Soldier> army);

    String reportCasualty(int soldierId);

    void reportVictory(int remainingNumberOfSoldiers);


}
