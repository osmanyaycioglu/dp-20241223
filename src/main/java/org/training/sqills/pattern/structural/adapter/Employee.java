package org.training.sqills.pattern.structural.adapter;

import org.training.sqills.pattern.playground.annotations.AdapterMapping;

public class Employee {
    @AdapterMapping(target = "name",targetClass = Person.class)
    private String firstName;
    @AdapterMapping(target = "middleName",targetClass = Person.class)
    private String middleName;
    @AdapterMapping(target = "surname",targetClass = Person.class)
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstNameParam) {
        firstName = firstNameParam;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(final String middleNameParam) {
        middleName = middleNameParam;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastNameParam) {
        lastName = lastNameParam;
    }
}
