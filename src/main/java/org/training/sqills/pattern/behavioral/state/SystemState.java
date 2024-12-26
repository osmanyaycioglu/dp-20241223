package org.training.sqills.pattern.behavioral.state;

public class SystemState implements ISystemState {
    private ISystemState currentState = new Start();

    @Override
    public ISystemState pauseSys(String str) {
        currentState = currentState.pauseSys(str);
        return currentState;
    }

    @Override
    public ISystemState restart(String str) {
        currentState = currentState.restart(str);
        return currentState;
    }

    @Override
    public ISystemState stopSys(String str) {
        currentState = currentState.stopSys(str);
        return currentState;
    }

    @Override
    public ESystemState systemState() {
        return currentState.systemState();
    }
}
