package org.training.sqills.pattern.playground.annotations;

import org.training.sqills.pattern.structural.adapter.Employee;
import org.training.sqills.pattern.structural.adapter.Person;

public class AdaptMain {
    public static void main(String[] args) {
        Employee employeeLoc = new Employee();
        employeeLoc.setFirstName("osman");
        employeeLoc.setMiddleName("tulgar");
        employeeLoc.setLastName("yaycıoğlu");

        Person oLoc = (Person) AdapterImpl.adaptObj(employeeLoc);
        System.out.println(oLoc);

        Person personLoc = AdapterImpl.adapt(employeeLoc);
        System.out.println(personLoc);
    }
}
