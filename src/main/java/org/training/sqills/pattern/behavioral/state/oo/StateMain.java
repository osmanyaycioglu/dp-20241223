package org.training.sqills.pattern.behavioral.state.oo;

public class StateMain {
    public static void main(String[] args) {
        IProcessState processStateLoc = new CurrentProcessState();
        processStateLoc.run();
        processStateLoc.stop();
        processStateLoc.run();
        processStateLoc.stop();
        processStateLoc.stop();
        processStateLoc.run();
    }
}
