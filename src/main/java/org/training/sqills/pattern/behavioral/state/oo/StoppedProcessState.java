package org.training.sqills.pattern.behavioral.state.oo;

public class StoppedProcessState implements IProcessState{

    @Override
    public IProcessState run() {
        System.out.println("sistem yaniden çalıştırılıyor");
        return new RunningProcessState();
    }

    @Override
    public IProcessState stop() {
        System.out.println("zaten durma durumda");
        return this;
    }
}
