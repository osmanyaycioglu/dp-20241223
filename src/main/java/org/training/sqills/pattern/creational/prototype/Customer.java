package org.training.sqills.pattern.creational.prototype;

import java.time.ZonedDateTime;

public class Customer {
    private String        name;
    private String        surname;
    private String        rule;
    private ZonedDateTime processDate;

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

    public String getRule() {
        return rule;
    }

    public void setRule(final String ruleParam) {
        rule = ruleParam;
    }

    public ZonedDateTime getProcessDate() {
        return processDate;
    }

    public void setProcessDate(final ZonedDateTime processDateParam) {
        processDate = processDateParam;
    }

    public Customer cloneMe() {
        Customer customerLoc = new Customer();
        customerLoc.setProcessDate(processDate);
        customerLoc.setRule(rule);
        return customerLoc;
    }
}
