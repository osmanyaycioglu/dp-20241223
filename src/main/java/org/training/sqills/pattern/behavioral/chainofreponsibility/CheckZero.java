package org.training.sqills.pattern.behavioral.chainofreponsibility;

public class CheckZero extends AbstractNumberCheckChain {

    public CheckZero(final NumberCheckChain numberCheckChainParam) {
        super(numberCheckChainParam);
    }

    @Override
    boolean check(final int number) {
        if (number == 0) {
            System.out.println("zero");
            return true;
        }
        return false;
    }

}
