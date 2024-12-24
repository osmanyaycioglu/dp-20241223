package org.training.sqills.pattern.abstractclass;

public interface IProcess {

    String execute(String str);
    String teardown(String stringParam, Integer integerParam);
    String afterProcess(Long longParam);
}
