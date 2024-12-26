package org.training.sqills.pattern.behavioral.strategy;

public class SoldierRun {

    public static void main(String[] args) {
        Soldier soldier =new Soldier(new NormalShooter(),new NormalDuck());
        Soldier sniper = new Soldier(new LongRangeSharpShooterShooter(),new NormalDuck());
        Soldier closeCombat = new Soldier(new CloseRangeSharpShooterShooter(),new FastDuck());
        Soldier superSoldier = new Soldier(new LongRangeSharpShooterShooter(),new FastDuck());
    }

}
