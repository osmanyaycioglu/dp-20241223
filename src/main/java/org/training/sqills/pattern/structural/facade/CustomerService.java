package org.training.sqills.pattern.structural.facade;

import org.training.sqills.pattern.rest.Customer;

public class CustomerService {
    private ICustomerFacade customerFacade;

    public void addCustomer(Customer customerParam){
            customerFacade.add(customerParam);
            customerFacade.mark(customerParam);
    }

    public void checkCustomer(Customer customerParam){
        boolean bLoc = customerFacade.checkCustomer(customerParam);

    }

    public void updateCustomer(Customer customerParam){
        customerFacade.getCustomer();
    }

    public void reactivateCustomer(Customer customerParam){
        customerFacade.add(customerParam);
        customerFacade.mark(customerParam);

    }


}
