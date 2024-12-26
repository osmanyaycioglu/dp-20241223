package org.training.sqills.pattern.structural.facade;

import org.training.sqills.pattern.rest.Customer;

public class CustomerDao {
    public void insertCustomer(Customer customerParam){
    }

    public Customer getCustomer(){
        return new Customer();
    }

    public void updateCustomer(Customer customerParam){
    }

}
