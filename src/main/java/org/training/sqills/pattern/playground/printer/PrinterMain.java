package org.training.sqills.pattern.playground.printer;

public class PrinterMain {
    public static void main(String[] args) {
        Printer printerLoc = new Printer();
        Person personLoc = new Person();
        personLoc.setName("osman");
        personLoc.setMiddleName("tulgar");
        personLoc.setSurname("yaycıoğlu");
        System.out.println(printerLoc.print(personLoc));
    }
}
