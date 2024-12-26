package org.training.sqills.pattern.behavioral.chainofreponsibility;

public class CheckLittleNumber extends AbstractNumberCheckChain {

    public CheckLittleNumber(final NumberCheckChain numberCheckChainParam) {
        super(numberCheckChainParam);
    }

    @Override
    boolean check(final int value) {
        if (value > 0 && value < 100) {
            System.out.println("Little number");
            return true;
        }
        return false;
    }

}
