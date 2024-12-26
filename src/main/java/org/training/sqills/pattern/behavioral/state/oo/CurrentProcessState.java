package org.training.sqills.pattern.behavioral.state.oo;

public class CurrentProcessState implements IProcessState {
    private IProcessState currentSate = new BootProcessState();

    @Override
    public synchronized IProcessState run() {
        IProcessState runLoc = currentSate.run();
        currentSate = runLoc;
        return runLoc;
    }

    @Override
    public synchronized IProcessState stop() {
        IProcessState stopLoc = currentSate.stop();
        currentSate = stopLoc;
        return stopLoc;
    }
}
