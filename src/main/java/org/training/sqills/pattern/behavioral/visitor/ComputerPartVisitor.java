package org.training.sqills.pattern.behavioral.visitor;

public interface ComputerPartVisitor {
    void visit(Mouse o);
    void visit(Keyboard o);
    void visit(Monitor o);

}
