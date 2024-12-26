package org.training.sqills.pattern.behavioral.state;

public interface ISystemState {
    ISystemState pauseSys(String str);
    ISystemState restart(String str);
    ISystemState stopSys(String str);
    ESystemState systemState();
}
