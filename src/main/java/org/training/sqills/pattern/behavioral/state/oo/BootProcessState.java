package org.training.sqills.pattern.behavioral.state.oo;

public class BootProcessState implements IProcessState{

    @Override
    public IProcessState run() {
        // init  kodu
        System.out.println("sistem çalışmaya başladı");
        return new RunningProcessState();
    }

    @Override
    public IProcessState stop() {
        return this;
    }
}
