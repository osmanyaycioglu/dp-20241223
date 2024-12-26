package org.training.sqills.pattern.behavioral.state.oo;

public interface IProcessState {
    IProcessState run();
    IProcessState stop();
}
