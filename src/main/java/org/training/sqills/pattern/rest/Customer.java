package org.training.sqills.pattern.rest;

public class Customer {
    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public void setName(final String nameParam) {
        name = nameParam;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(final String surnameParam) {
        surname = surnameParam;
    }
}
