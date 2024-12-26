package org.training.sqills.pattern.behavioral.chainofreponsibility;

public abstract class AbstractNumberCheckChain implements NumberCheckChain {
    private final NumberCheckChain numberCheckChain;

    public AbstractNumberCheckChain(final NumberCheckChain numberCheckChainParam) {
        numberCheckChain = numberCheckChainParam;
    }

    @Override
    public boolean checkNumber(final int number) {
        if (check(number)) {
            return true;
        }
        if (numberCheckChain == null) {
            return false;
        }
        return numberCheckChain.checkNumber(number);
    }

    abstract boolean check(int number);
}
