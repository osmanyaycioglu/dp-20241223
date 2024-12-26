package org.training.sqills.pattern.structural.adapter;

public class Person {
    private String name;
    private String middleName;
    private String surname;

    public String getName() {
        return name;
    }

    public void setName(final String nameParam) {
        name = nameParam;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(final String middleNameParam) {
        middleName = middleNameParam;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(final String surnameParam) {
        surname = surnameParam;
    }

    @Override
    public String toString() {
        return "Person{" +
               "name='" + name + '\'' +
               ", middleName='" + middleName + '\'' +
               ", surname='" + surname + '\'' +
               '}';
    }
}
