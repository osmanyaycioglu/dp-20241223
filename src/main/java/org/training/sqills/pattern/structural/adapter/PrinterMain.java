package org.training.sqills.pattern.structural.adapter;

public class PrinterMain {
    public static void main(String[] args) {
        PrinterEx printerLoc = new PrinterEx();
        Person  personLoc  = new Person();
        personLoc.setName("osman");
        personLoc.setMiddleName("tulgar");
        personLoc.setSurname("yaycıoğlu");
        System.out.println(printerLoc.print(personLoc));

        Employee employeeLoc = new Employee();
        employeeLoc.setFirstName("ali");
        employeeLoc.setMiddleName("mehmet");
        employeeLoc.setLastName("alaz");

        System.out.println(printerLoc.print(new PersonEmployeeAdapter(employeeLoc)));
        System.out.println(printerLoc.print(employeeLoc));

    }
}
