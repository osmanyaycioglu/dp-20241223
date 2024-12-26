package org.training.sqills.pattern.structural.adapter;

public class PrinterEx extends Printer {

    public String print(Employee employeeParam) {
        Person personLoc = new Person();
        personLoc.setName(employeeParam.getFirstName());
        personLoc.setMiddleName(employeeParam.getMiddleName());
        personLoc.setSurname(employeeParam.getLastName());
        return super.print(personLoc);
    }

}
