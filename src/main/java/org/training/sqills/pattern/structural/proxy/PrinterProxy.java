package org.training.sqills.pattern.structural.proxy;

import org.training.sqills.pattern.structural.adapter.Person;
import org.training.sqills.pattern.structural.adapter.Printer;

public class PrinterProxy extends Printer {

    @Override
    public String print(final Person personParam) {
        if (personParam.getName() == null){
            throw new IllegalArgumentException();
        }
        return super.print(personParam);
    }
}
