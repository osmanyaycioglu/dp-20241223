package org.training.sqills.pattern.behavioral.chainofreponsibility;

public class CheckBigNumber extends AbstractNumberCheckChain {

    public CheckBigNumber(final NumberCheckChain numberCheckChainParam) {
        super(numberCheckChainParam);
    }

    @Override
    boolean check(final int value) {
        if (value >= 500) {
            System.out.println("big number");
            return true;
        }
        return false;
    }

}
