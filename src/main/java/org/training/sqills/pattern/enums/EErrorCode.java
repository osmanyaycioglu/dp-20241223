package org.training.sqills.pattern.enums;

public enum EErrorCode {
    NEW_ERROR("NEW"){
        @Override
        public String hello() {
            return "new hello " + getDesc();
        }
    }, // new NEW_ERROR extends EErrorcoed
    INTERNAL_ERROR("int"),
    SUBSYSTEM_ERROR("sub"),
    USER_ERROR("user");

    private String desc;

    EErrorCode(final String descParam) {
        desc = descParam;
    }

    public String getDesc() {
        return desc;
    }

    public String hello(){
        return "Hello " + desc;
    }
}
