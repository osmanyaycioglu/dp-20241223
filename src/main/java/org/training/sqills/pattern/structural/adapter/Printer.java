package org.training.sqills.pattern.structural.adapter;

public class Printer {

    public String print(Person personParam) {
        return "Sayın : " + personParam.getName() + " " + personParam.getMiddleName() + " " + personParam.getSurname();
    }

}
