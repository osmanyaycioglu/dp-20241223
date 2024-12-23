package org.training.sqills.pattern.interfaces;

@FunctionalInterface
public interface IProcess {

    String ABC = "TEST 123";

    String execute(String ruleName);

    default String executeChain(IProcess processParam,
                                String ruleName) {
        return execute(processParam.execute(ruleName));
    }

}
