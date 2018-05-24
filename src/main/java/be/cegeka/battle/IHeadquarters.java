package be.cegeka.battle;


public interface IHeadquarters {

    int reportEnlistment(Soldier soldier);

    void reportCasualty(int soldierId);

    void reportVictory(int remainingNumberOfSoldiers);


}
