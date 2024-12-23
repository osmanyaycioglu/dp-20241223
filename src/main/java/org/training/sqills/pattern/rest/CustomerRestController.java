package org.training.sqills.pattern.rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

import java.util.List;

@Path("/customer")
public class CustomerRestController {

    @POST
    @Path("/insert")
    public void insert(Customer customerParam){

    }

    @GET
    @Path("/get/all")
    public List<Customer> getAllCustomer(){
        return null;
    }

}
