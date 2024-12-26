package org.training.sqills.pattern.behavioral.observer;

public interface IAlarmObserver {
    void alarmOn(EAlarmType eAlarmType);

    void alarmOff();
}
