package org.training.sqills.pattern.behavioral.observer;

public class AlarmRun {

    public static void main(String[] args) {
        Alarm alarmDistributor = Alarm.getInstance();
        AlarmSoundObserver alarmSound = new AlarmSoundObserver();
        DoorAlarmObserver doorAlarm1 = new DoorAlarmObserver(1);
        DoorAlarmObserver doorAlarm2 = new DoorAlarmObserver(1);
        DoorAlarmObserver doorAlarm3 = new DoorAlarmObserver(1);
        DoorAlarmObserver doorAlarm4 = new DoorAlarmObserver(1);
        DoorAlarmObserver doorAlarm5 = new DoorAlarmObserver(1);
        DoorAlarmObserver doorAlarm6 = new DoorAlarmObserver(1);
        GateAlarmObserver gateAlarm = new GateAlarmObserver();
        GateAlarmObserver gateAlarm2 = new GateAlarmObserver();

        alarmDistributor.alarmOn(EAlarmType.FIRE_ALARM);
        System.out.println("---------------------------------");
        alarmDistributor.alarmOff();

    }
}
