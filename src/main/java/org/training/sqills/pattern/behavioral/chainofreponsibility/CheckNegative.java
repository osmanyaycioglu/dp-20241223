package org.training.sqills.pattern.behavioral.chainofreponsibility;

public class CheckNegative extends AbstractNumberCheckChain {

    public CheckNegative(final NumberCheckChain numberCheckChainParam) {
        super(numberCheckChainParam);
    }

    @Override
    boolean check(final int number) {
        if (number < 0) {
            System.out.println("negative");
            return true;
        }
        return false;
    }

}
