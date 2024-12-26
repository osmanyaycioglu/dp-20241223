package org.training.sqills.pattern.behavioral.chainofreponsibility;

public class ChainMain {
    public static void main(String[] args) {
        int value = 100;
        if (value < 0) {
            System.out.println("negative");
        } else if (value == 0) {
            System.out.println("zero");
        } else if (value > 0 && value < 100) {
            System.out.println("Little number");
        } else if (value >= 100 && value < 500) {
            System.out.println("middle number");
        } else {
            System.out.println("Big number");
        }

        NumberCheckChain numberCheckChainLoc = new CheckNegative(new CheckZero(new CheckLittleNumber(new CheckMiddleNumber(new CheckBigNumber(null)))));
        numberCheckChainLoc.checkNumber(1000);
    }
}
