package org.training.sqills.pattern.behavioral.chainofreponsibility;

public class CheckMiddleNumber extends AbstractNumberCheckChain {

    public CheckMiddleNumber(final NumberCheckChain numberCheckChainParam) {
        super(numberCheckChainParam);
    }

    @Override
    boolean check(final int value) {
        if (value >= 100 && value < 500) {
            System.out.println("middle number");
            return true;
        }
        return false;
    }

}
