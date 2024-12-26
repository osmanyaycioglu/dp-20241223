package org.training.sqills.pattern.behavioral.observer;

public class GateAlarmObserver implements IAlarmObserver {

    public GateAlarmObserver() {
        Alarm.getInstance().register(this);

    }

    @Override
    public void alarmOn(EAlarmType eAlarmType) {
        System.out.println("Dış kapı açıldı");
    }

    @Override
    public void alarmOff() {
        System.out.println("Dış kapı kapandı");

    }
}
