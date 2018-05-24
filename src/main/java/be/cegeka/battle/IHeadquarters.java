package be.cegeka.battle;

import java.util.ArrayList;

public interface IHeadquarters {

    int reportEnlistment(Soldier soldier, ArrayList<Soldier> army);

    void reportCasualty(int soldierId);

    void reportVictory(int remainingNumberOfSoldiers);


}
