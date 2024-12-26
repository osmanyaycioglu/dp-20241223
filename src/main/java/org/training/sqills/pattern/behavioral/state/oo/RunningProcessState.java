package org.training.sqills.pattern.behavioral.state.oo;

public class RunningProcessState implements IProcessState{

    @Override
    public IProcessState run() {
        System.out.println("already running");
        return this;
    }

    @Override
    public IProcessState stop() {
        // Deinit kodu
        System.out.println("sistem kapatıldı");
        return new StoppedProcessState();
    }
}
