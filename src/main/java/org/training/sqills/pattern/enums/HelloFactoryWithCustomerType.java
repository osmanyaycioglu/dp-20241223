package org.training.sqills.pattern.enums;

import org.training.sqills.pattern.interfaces.polymorphic.IHello;

import java.util.List;

public class HelloFactoryWithCustomerType {
    public List<IHello> getLanguages(int index) {
        ECustomerLanguage customerLanguagesLoc = ECustomerLanguage.getCustomerLanguages(index);
        if (customerLanguagesLoc != null) {
            return customerLanguagesLoc.getHellos();
        }
        return List.of();
    }
}
