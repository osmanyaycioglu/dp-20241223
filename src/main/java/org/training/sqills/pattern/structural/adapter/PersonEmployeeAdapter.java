package org.training.sqills.pattern.structural.adapter;

public class PersonEmployeeAdapter extends Person {
    private final Employee employee;

    public PersonEmployeeAdapter(final Employee employeeParam) {
        employee = employeeParam;
    }

    @Override
    public String getName() {
        return employee.getFirstName();
    }

    @Override
    public String getMiddleName() {
        return employee.getMiddleName();
    }

    @Override
    public String getSurname() {
        return employee.getLastName();
    }
}
