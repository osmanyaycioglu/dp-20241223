package org.training.sqills.pattern.playground.printer;

public class Printer {

    public String print(Person personParam) {
        return "Sayın : " + personParam.getName() + " " + personParam.getMiddleName() + " " + personParam.getSurname();
    }

}
