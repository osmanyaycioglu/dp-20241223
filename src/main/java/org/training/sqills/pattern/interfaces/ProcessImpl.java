package org.training.sqills.pattern.interfaces;

public class ProcessImpl implements IProcess{

    @Override
    public String execute(final String ruleName) {
        return "Executing : " + ruleName;
    }
}
