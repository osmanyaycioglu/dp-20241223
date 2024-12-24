package org.training.sqills.pattern.enums;

public class EnumMain {
    public static final int ARGUMENT_LENGTH = 5;
    public static final int RULE_PROCESS_COUNT = 5;

    public static void main(final String[] args) {
        System.out.println(EErrorCode.SUBSYSTEM_ERROR.hello());
        System.out.println(EErrorCode.NEW_ERROR.hello());
        if (args.length == ARGUMENT_LENGTH) {
            System.out.println("wrong");
        }
        for (int i = 0; i < RULE_PROCESS_COUNT; i++) {
            System.out.println("deneme" + i);
        }

    }
}
