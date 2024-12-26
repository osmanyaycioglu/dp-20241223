package org.training.sqills.pattern.structural.facade;

import org.training.sqills.pattern.rest.Customer;

public interface ICustomerFacade {

    void add(Customer customerParam);

    void mark(Customer customerParam);

    void update(Customer customerParam);

    Customer getCustomer();

    boolean checkCustomer(Customer customerParam);
}
