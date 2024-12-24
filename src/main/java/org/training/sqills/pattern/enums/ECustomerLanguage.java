package org.training.sqills.pattern.enums;

import org.training.sqills.pattern.interfaces.polymorphic.*;

import java.util.List;

public enum ECustomerLanguage {
    GOLD(2,
         List.of(new HelloEng(),
                 new HelloTr())),
    PLATINUM(3,
             List.of(new HelloEng(),
                     new HelloTr(),
                     new HelloEsp(),
                     new HelloJp())),
    SILVER(1,
           List.of(new HelloTr()));

    private final int          index;
    private final List<IHello> hellos;

    ECustomerLanguage(int index,
                      final List<IHello> hellosParam) {
        this.index = index;
        hellos     = hellosParam;
    }

    public List<IHello> getHellos() {
        return hellos;
    }

    public int getIndex() {
        return index;
    }

    public static ECustomerLanguage getCustomerLanguages(int index) {
        ECustomerLanguage[] valuesLoc = ECustomerLanguage.values();
        for (ECustomerLanguage valueLoc : valuesLoc) {
            if (index == valueLoc.getIndex()) {
                return valueLoc;
            }
        }
        return null;
    }
}
