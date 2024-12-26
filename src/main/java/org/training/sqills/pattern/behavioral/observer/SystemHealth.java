package org.training.sqills.pattern.behavioral.observer;

public class SystemHealth {

    public void check() {
        Alarm.getInstance()
             .alarmOn(EAlarmType.BURGLAR_ALARM);
    }

}
