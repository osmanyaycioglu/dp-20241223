package org.training.sqills.pattern.structural.facade;

import org.training.sqills.pattern.rest.Customer;

public class CustomerFacade implements  ICustomerFacade {
    private FraudIntegration fraudIntegration = new FraudIntegration();
    private CustomerDao customerDao = new CustomerDao();

    @Override
    public void add(final Customer customerParam) {
        boolean bLoc = checkCustomer(customerParam);
        customerDao.insertCustomer(customerParam);

    }


    @Override
    public void mark(final Customer customerParam) {
        fraudIntegration.markCustomer(customerParam);

    }

    @Override
    public void update(Customer customerParam){
        customerDao.updateCustomer(customerParam);
    }

    @Override
    public Customer getCustomer() {
        return null;
    }

    @Override
    public boolean checkCustomer(final Customer customerParam) {
        return fraudIntegration.checkCustomer(customerParam);
    }
}
